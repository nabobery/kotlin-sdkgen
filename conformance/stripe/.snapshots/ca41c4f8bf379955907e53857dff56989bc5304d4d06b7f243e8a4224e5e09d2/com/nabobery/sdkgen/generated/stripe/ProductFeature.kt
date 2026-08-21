package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * A product_feature represents an attachment between a feature and a product.
 * When a product is purchased that has a feature attached, Stripe will create an entitlement to the feature for the
 * purchasing customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/product_feature
 */
@Serializable(with = ProductFeature.Serializer::class)
public class ProductFeature(
  public val entitlementFeature: EntitlementsFeature,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineProductFeatureObjectValueXb9b8427f,
) {
  public class Builder {
    private var entitlementFeatureValue: EntitlementsFeature? = null

    public var entitlementFeature: EntitlementsFeature
      get() = requireNotNull(entitlementFeatureValue) { "entitlementFeature is required" }
      set(`value`) {
        entitlementFeatureValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineProductFeatureObjectValueXb9b8427f? = null

    public var objectValue: InlineProductFeatureObjectValueXb9b8427f
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): ProductFeature {
      check(entitlementFeatureValue != null) { "entitlementFeature is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return ProductFeature(
        entitlementFeature = entitlementFeature,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProductFeature = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProductFeature> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProductFeature {
      val jsonDecoder = decoder.requireJsonDecoder("ProductFeature")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProductFeature must be a JSON object")
      val entitlementFeature = json.decodeRequired<EntitlementsFeature>(rawObject, "entitlement_feature")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineProductFeatureObjectValueXb9b8427f>(rawObject, "object")
      return ProductFeature(
        entitlementFeature = entitlementFeature,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProductFeature) {
      val jsonEncoder = encoder.requireJsonEncoder("ProductFeature")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("entitlement_feature", json.encodeToJsonElement(value.entitlementFeature))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun productFeature(block: ProductFeature.Builder.() -> Unit): ProductFeature = ProductFeature.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProductFeature is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
