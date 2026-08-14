package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94.Serializer::class)
public class InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94(
  /**
   * Inactive features cannot be attached to new products and will not be returned from the features list endpoint.
   */
  public val active: Boolean? = null,
  expand: List<String>? = null,
  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information
   * about the object in a structured format.
   */
  public val metadata: InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597? = null,
  /**
   * The feature's name, for your own purpose, not meant to be displayable to the customer.
   */
  public val name: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Inactive features cannot be attached to new products and will not be returned from the features list endpoint.
     */
    public var active: Boolean? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information
     * about the object in a structured format.
     */
    public var metadata: InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597? = null

    /**
     * The feature's name, for your own purpose, not meant to be displayable to the customer.
     */
    public var name: String? = null

    public fun build(): InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94 = InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94(
      active = active,
      expand = expand,
      metadata = metadata,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94 must be a JSON object")
      return InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94(block: InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94.Builder.() -> Unit): InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94 = InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94.build(block)
