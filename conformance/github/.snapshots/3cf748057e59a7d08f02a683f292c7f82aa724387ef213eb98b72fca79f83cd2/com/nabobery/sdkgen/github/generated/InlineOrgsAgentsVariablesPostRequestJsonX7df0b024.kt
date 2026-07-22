package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables/post/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables/post/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineOrgsAgentsVariablesPostRequestJsonX7df0b024.Serializer::class)
public class InlineOrgsAgentsVariablesPostRequestJsonX7df0b024(
  /**
   * The name of the variable.
   */
  public val name: String,
  /**
   * The value of the variable.
   */
  public val `value`: String,
  /**
   * The type of repositories in the organization that can access the variable. `selected` means only the repositories
   * specified by `selected_repository_ids` can access the variable.
   */
  public val visibility: InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab,
  /**
   * An array of repository ids that can access the organization variable. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`.
   */
  public val selectedRepositoryIds: List<Int>? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    private var visibilityValue: InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab? = null

    public var visibility: InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * An array of repository ids that can access the organization variable. You can only provide a list of repository
     * ids when the `visibility` is set to `selected`.
     */
    public var selectedRepositoryIds: List<Int>? = null

    public fun build(): InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsAgentsVariablesPostRequestJsonX7df0b024(
        name = name,
        value = value,
        visibility = visibility,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsAgentsVariablesPostRequestJsonX7df0b024> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAgentsVariablesPostRequestJsonX7df0b024")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      val visibility = json.decodeRequired<InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab>(rawObject, "visibility")
      return InlineOrgsAgentsVariablesPostRequestJsonX7df0b024(
        name = name,
        value = value,
        visibility = visibility,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsVariablesPostRequestJsonX7df0b024) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAgentsVariablesPostRequestJsonX7df0b024")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("value", value.value)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAgentsVariablesPostRequestJsonX7df0b024(block: InlineOrgsAgentsVariablesPostRequestJsonX7df0b024.Builder.() -> Unit): InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 = InlineOrgsAgentsVariablesPostRequestJsonX7df0b024.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsAgentsVariablesPostRequestJsonX7df0b024 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
