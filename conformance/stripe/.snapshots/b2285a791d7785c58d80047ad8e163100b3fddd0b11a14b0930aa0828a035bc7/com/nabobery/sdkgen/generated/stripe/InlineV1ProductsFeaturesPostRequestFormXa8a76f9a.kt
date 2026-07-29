package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{product}~1features/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{product}~1features/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema
 */
@Serializable(with = InlineV1ProductsFeaturesPostRequestFormXa8a76f9a.Serializer::class)
public class InlineV1ProductsFeaturesPostRequestFormXa8a76f9a(
  /**
   * The ID of the [Feature](https://docs.stripe.com/api/entitlements/feature) object attached to this product.
   */
  public val entitlementFeature: String,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var entitlementFeatureValue: String? = null

    public var entitlementFeature: String
      get() = requireNotNull(entitlementFeatureValue) { "entitlementFeature is required" }
      set(`value`) {
        entitlementFeatureValue = value
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

    public fun build(): InlineV1ProductsFeaturesPostRequestFormXa8a76f9a {
      check(entitlementFeatureValue != null) { "entitlementFeature is required" }
      return InlineV1ProductsFeaturesPostRequestFormXa8a76f9a(
        entitlementFeature = entitlementFeature,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ProductsFeaturesPostRequestFormXa8a76f9a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ProductsFeaturesPostRequestFormXa8a76f9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsFeaturesPostRequestFormXa8a76f9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsFeaturesPostRequestFormXa8a76f9a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ProductsFeaturesPostRequestFormXa8a76f9a must be a JSON object")
      val entitlementFeature = json.decodeRequired<String>(rawObject, "entitlement_feature")
      return InlineV1ProductsFeaturesPostRequestFormXa8a76f9a(
        entitlementFeature = entitlementFeature,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsFeaturesPostRequestFormXa8a76f9a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ProductsFeaturesPostRequestFormXa8a76f9a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("entitlement_feature", value.entitlementFeature)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ProductsFeaturesPostRequestFormXa8a76f9a(block: InlineV1ProductsFeaturesPostRequestFormXa8a76f9a.Builder.() -> Unit): InlineV1ProductsFeaturesPostRequestFormXa8a76f9a = InlineV1ProductsFeaturesPostRequestFormXa8a76f9a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ProductsFeaturesPostRequestFormXa8a76f9a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
