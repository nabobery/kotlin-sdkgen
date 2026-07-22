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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1detach/delete/requestBody/content/a
 * pplication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1detach/delete/requestBody/content/a
 * pplication~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository IDs to detach from configurations. Up to 250 IDs can be provided.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }
      set(`value`) {
        selectedRepositoryIdsValue = value
      }

    public fun build(): InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b(block: InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b = InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
