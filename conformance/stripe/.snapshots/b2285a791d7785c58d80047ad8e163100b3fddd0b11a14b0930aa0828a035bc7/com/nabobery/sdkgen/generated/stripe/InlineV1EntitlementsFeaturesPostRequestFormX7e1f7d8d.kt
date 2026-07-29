package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features/post/requestBody/content/application~1x-www-form-url
 * encoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features/post/requestBody/content/application~1x-www-form-url
 * encoded/schema
 */
@Serializable(with = InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d.Serializer::class)
public class InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d(
  /**
   * A unique key you provide as your own system identifier. This may be up to 80 characters.
   */
  public val lookupKey: String,
  /**
   * The feature's name, for your own purpose, not meant to be displayable to the customer.
   */
  public val name: String,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information
   * about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var lookupKeyValue: String? = null

    public var lookupKey: String
      get() = requireNotNull(lookupKeyValue) { "lookupKey is required" }
      set(`value`) {
        lookupKeyValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information
     * about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d {
      check(lookupKeyValue != null) { "lookupKey is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d(
        lookupKey = lookupKey,
        name = name,
        expand = expand,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d must be a JSON object")
      val lookupKey = json.decodeRequired<String>(rawObject, "lookup_key")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d(
        lookupKey = lookupKey,
        name = name,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("lookup_key", value.lookupKey)
        put("name", value.name)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d(block: InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d.Builder.() -> Unit): InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d = InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
