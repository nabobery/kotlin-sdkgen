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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_automatic_tax
 */
@Serializable(with = QuotesResourceAutomaticTax.Serializer::class)
public class QuotesResourceAutomaticTax(
  /**
   * Automatically calculate taxes
   */
  public val enabled: Boolean,
  /**
   * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
   * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
   */
  public val liability: InlineQuotesResourceAutomaticTaxLiabilityX4f951183? = null,
  /**
   * The tax provider powering automatic tax.
   */
  public val provider: String? = null,
  /**
   * The status of the most recent automated tax calculation for this quote.
   */
  public val status: InlineQuotesResourceAutomaticTaxStatusX5a0812d5? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
     * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
     */
    public var liability: InlineQuotesResourceAutomaticTaxLiabilityX4f951183? = null

    /**
     * The tax provider powering automatic tax.
     */
    public var provider: String? = null

    /**
     * The status of the most recent automated tax calculation for this quote.
     */
    public var status: InlineQuotesResourceAutomaticTaxStatusX5a0812d5? = null

    public fun build(): QuotesResourceAutomaticTax {
      check(enabledValue != null) { "enabled is required" }
      return QuotesResourceAutomaticTax(
        enabled = enabled,
        liability = liability,
        provider = provider,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceAutomaticTax = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<QuotesResourceAutomaticTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceAutomaticTax {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceAutomaticTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceAutomaticTax must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return QuotesResourceAutomaticTax(
        enabled = enabled,
        liability = rawObject["liability"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuotesResourceAutomaticTaxLiabilityX4f951183?>(element) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuotesResourceAutomaticTaxStatusX5a0812d5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceAutomaticTax) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceAutomaticTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceAutomaticTax(block: QuotesResourceAutomaticTax.Builder.() -> Unit): QuotesResourceAutomaticTax = QuotesResourceAutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("QuotesResourceAutomaticTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
