using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

public class TurtleControl : MonoBehaviour
{
    // Start is called before the first frame update
    LineRenderer currentRenderer;
    public GameObject lineRendererPrefab;
    List<LineRenderer> allRenderers;
    [SerializeField] float lineWidth = 2.0f;
    public Color color;

    void Start()
    {
        allRenderers = new List<LineRenderer>();
        PenDown();
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void Forward(float amount)
    {
        transform.Translate(Vector3.forward * amount);
        AddPoint();
    }
    public void Backwards(float amount)
    {
        transform.Translate(Vector3.back * amount);
        AddPoint();
    }
    public void TurnLeft(float angle)
    {
        transform.Rotate(0, -angle, 0);
    }
    public void TurnRight(float angle)
    {
        transform.Rotate(0, angle, 0);
    }
    public void PenDown()
    {
        //currentRenderer = this.gameObject.AddComponent<LineRenderer>();
        currentRenderer = Instantiate(lineRendererPrefab, Vector3.zero, Quaternion.identity, null).GetComponent<LineRenderer>();
        Debug.Log("Filler 1: Current Renderer initialized");
        allRenderers.Add(currentRenderer);
        Debug.Log("Filler 2: Current Renderer added");

        //currentRenderer.startColor = color;
        //currentRenderer.endColor = color;

        //currentRenderer.startWidth = lineWidth;
        //currentRenderer.endWidth = lineWidth;

        currentRenderer.positionCount = 1;
        currentRenderer.SetPosition(0, transform.position);
    }
    public void PenUp()
    {
        currentRenderer = null;
    }
    private void AddPoint()
    {
        List<Vector3> currentPositions = new List<Vector3>();
        for (int i = 0; i < currentRenderer.positionCount; i++)
        {
            currentPositions.Add(currentRenderer.GetPosition(i));
        }
        currentPositions.Add(new Vector3(transform.position.x, transform.position.y, transform.position.z));
        currentRenderer.positionCount += 1;
        currentRenderer.SetPositions(currentPositions.ToArray());
    }
}
