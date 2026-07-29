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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables/post/requestBody/content/application~1json/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables/post/requestBody/content/application~1json/sche
 * ma
 */
@Serializable(with = InlineOrgsActionsVariablesPostRequestJsonX14589a7b.Serializer::class)
public class InlineOrgsActionsVariablesPostRequestJsonX14589a7b(
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
  public val visibility: InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1,
  selectedRepositoryIds: List<Int>? = null,
) {
  /**
   * An array of repository ids that can access the organization variable. You can only provide a list of repository ids
   * when the `visibility` is set to `selected`.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

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

    private var visibilityValue: InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1? =
        null

    public var visibility: InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository ids that can access the organization variable. You can only provide a list of repository
     * ids when the `visibility` is set to `selected`.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsActionsVariablesPostRequestJsonX14589a7b {
      check(nameValue != null) { "name is required" }
      check(valueValue != null) { "value is required" }
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsActionsVariablesPostRequestJsonX14589a7b(
        name = name,
        value = value,
        visibility = visibility,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsVariablesPostRequestJsonX14589a7b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsVariablesPostRequestJsonX14589a7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesPostRequestJsonX14589a7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsVariablesPostRequestJsonX14589a7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsVariablesPostRequestJsonX14589a7b must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val value = json.decodeRequired<String>(rawObject, "value")
      val visibility = json.decodeRequired<InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1>(rawObject, "visibility")
      return InlineOrgsActionsVariablesPostRequestJsonX14589a7b(
        name = name,
        value = value,
        visibility = visibility,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesPostRequestJsonX14589a7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsVariablesPostRequestJsonX14589a7b")
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

public fun inlineOrgsActionsVariablesPostRequestJsonX14589a7b(block: InlineOrgsActionsVariablesPostRequestJsonX14589a7b.Builder.() -> Unit): InlineOrgsActionsVariablesPostRequestJsonX14589a7b = InlineOrgsActionsVariablesPostRequestJsonX14589a7b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsVariablesPostRequestJsonX14589a7b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
