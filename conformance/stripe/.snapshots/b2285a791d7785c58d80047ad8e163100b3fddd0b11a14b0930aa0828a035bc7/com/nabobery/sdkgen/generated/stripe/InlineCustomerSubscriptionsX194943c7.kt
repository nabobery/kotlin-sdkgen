package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The customer's current subscriptions, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/subscriptions
 */
@Serializable(with = InlineCustomerSubscriptionsX194943c7.Serializer::class)
public class InlineCustomerSubscriptionsX194943c7(
  `data`: List<Subscription>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineCustomerSubscriptionsObjectValueX127ca37a,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<Subscription> = data.toList()

  public class Builder {
    private var dataValue: List<Subscription>? = null

    public var `data`: List<Subscription>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineCustomerSubscriptionsObjectValueX127ca37a? = null

    public var objectValue: InlineCustomerSubscriptionsObjectValueX127ca37a
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineCustomerSubscriptionsX194943c7 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineCustomerSubscriptionsX194943c7(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCustomerSubscriptionsX194943c7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCustomerSubscriptionsX194943c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSubscriptionsX194943c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSubscriptionsX194943c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCustomerSubscriptionsX194943c7 must be a JSON object")
      val data = json.decodeRequired<List<Subscription>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineCustomerSubscriptionsObjectValueX127ca37a>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineCustomerSubscriptionsX194943c7(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSubscriptionsX194943c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCustomerSubscriptionsX194943c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCustomerSubscriptionsX194943c7(block: InlineCustomerSubscriptionsX194943c7.Builder.() -> Unit): InlineCustomerSubscriptionsX194943c7 = InlineCustomerSubscriptionsX194943c7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCustomerSubscriptionsX194943c7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
