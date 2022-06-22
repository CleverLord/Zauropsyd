using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[CreateAssetMenu(fileName = "TokenDB", menuName = "ScriptableObjects/TokenDatabase")]
public class TokenDatabase : ScriptableObject
{
    public List<TokenTemplate> tokenTemplates = new List<TokenTemplate>();
}
