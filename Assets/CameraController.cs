using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour
{
    // Start is called before the first frame update
    [SerializeField] GameObject cameraParent;
    public bool enabled = false;
    [SerializeField] float sensitivityX = 60;
    [SerializeField] float sensitivityY = 60;
    [SerializeField] float movementSpeed = 50;
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (enabled && Input.GetMouseButton(1))
        {
            Rotate();
            Move();
        }
    }

    private void Rotate()
    {
        float xRotation = transform.eulerAngles.x + sensitivityX * -Input.GetAxis("Mouse Y");
        float yRotation = transform.eulerAngles.y + sensitivityY * Input.GetAxis("Mouse X");
        if (xRotation < 270 && xRotation > 180)
        {
            xRotation = -90;
        }
        else if (xRotation > 90 && xRotation < 180)
        {
            xRotation = 90;
        }

        if (yRotation - 360 > 0 && yRotation > 0)
            yRotation -= 360;
        else if (yRotation + 360 < 0 && yRotation < 0)
            yRotation += 360;
        
        cameraParent.transform.eulerAngles = new Vector3(0, yRotation, 0);
        transform.localEulerAngles = new Vector3(xRotation, 0, 0);
    }

    private void Move()
    {
        float x = 0;
        float y = 0;
        float z = 0;

        if (Input.GetKey(KeyCode.Q))
        {
            y = movementSpeed * Time.deltaTime;
        } else if (Input.GetKey(KeyCode.E))
        {
            y = -movementSpeed * Time.deltaTime;
        } else
        {
            y = 0;
        }

        y *= -1;
        x = Input.GetAxis("Horizontal") * movementSpeed * Time.deltaTime;
        z = Input.GetAxis("Vertical") * movementSpeed * Time.deltaTime;

        cameraParent.transform.Translate(x, y, z);
    }
}
