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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A list of refunds that have been applied to the fee.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/refunds
 */
@Serializable(with = InlineApplicationFeeRefundsX8c1c63b4.Serializer::class)
public class InlineApplicationFeeRefundsX8c1c63b4(
  `data`: List<FeeRefund>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineApplicationFeeRefundsObjectValueXacf550da,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<FeeRefund> = data.toList()

  public class Builder {
    private var dataValue: List<FeeRefund>? = null

    public var `data`: List<FeeRefund>
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

    private var objectValueValue: InlineApplicationFeeRefundsObjectValueXacf550da? = null

    public var objectValue: InlineApplicationFeeRefundsObjectValueXacf550da
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

    public fun build(): InlineApplicationFeeRefundsX8c1c63b4 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineApplicationFeeRefundsX8c1c63b4(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationFeeRefundsX8c1c63b4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApplicationFeeRefundsX8c1c63b4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationFeeRefundsX8c1c63b4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeRefundsX8c1c63b4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationFeeRefundsX8c1c63b4 must be a JSON object")
      val data = json.decodeRequired<List<FeeRefund>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineApplicationFeeRefundsObjectValueXacf550da>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineApplicationFeeRefundsX8c1c63b4(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationFeeRefundsX8c1c63b4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationFeeRefundsX8c1c63b4")
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

public fun inlineApplicationFeeRefundsX8c1c63b4(block: InlineApplicationFeeRefundsX8c1c63b4.Builder.() -> Unit): InlineApplicationFeeRefundsX8c1c63b4 = InlineApplicationFeeRefundsX8c1c63b4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationFeeRefundsX8c1c63b4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
