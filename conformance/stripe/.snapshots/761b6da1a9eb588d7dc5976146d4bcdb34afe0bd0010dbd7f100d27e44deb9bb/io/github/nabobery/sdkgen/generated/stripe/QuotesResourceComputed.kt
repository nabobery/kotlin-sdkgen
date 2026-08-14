package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_computed
 */
@Serializable(with = QuotesResourceComputed.Serializer::class)
public class QuotesResourceComputed(
  public val upfront: QuotesResourceUpfront,
  /**
   * The definitive totals and line items the customer will be charged on a recurring basis. Takes into account the line
   * items with recurring prices and discounts with `duration=forever` coupons only. Defaults to `null` if no inputted
   * line items with recurring prices.
   */
  public val recurring: InlineQuotesResourceComputedRecurringXbed52f4d? = null,
) {
  public class Builder {
    private var upfrontValue: QuotesResourceUpfront? = null

    public var upfront: QuotesResourceUpfront
      get() = requireNotNull(upfrontValue) { "upfront is required" }
      set(`value`) {
        upfrontValue = value
      }

    /**
     * The definitive totals and line items the customer will be charged on a recurring basis. Takes into account the
     * line items with recurring prices and discounts with `duration=forever` coupons only. Defaults to `null` if no
     * inputted line items with recurring prices.
     */
    public var recurring: InlineQuotesResourceComputedRecurringXbed52f4d? = null

    public fun build(): QuotesResourceComputed {
      check(upfrontValue != null) { "upfront is required" }
      return QuotesResourceComputed(
        upfront = upfront,
        recurring = recurring,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceComputed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<QuotesResourceComputed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceComputed {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceComputed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceComputed must be a JSON object")
      val upfront = json.decodeRequired<QuotesResourceUpfront>(rawObject, "upfront")
      return QuotesResourceComputed(
        upfront = upfront,
        recurring = rawObject["recurring"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuotesResourceComputedRecurringXbed52f4d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceComputed) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceComputed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("upfront", json.encodeToJsonElement(value.upfront))
        value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceComputed(block: QuotesResourceComputed.Builder.() -> Unit): QuotesResourceComputed = QuotesResourceComputed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceComputed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
