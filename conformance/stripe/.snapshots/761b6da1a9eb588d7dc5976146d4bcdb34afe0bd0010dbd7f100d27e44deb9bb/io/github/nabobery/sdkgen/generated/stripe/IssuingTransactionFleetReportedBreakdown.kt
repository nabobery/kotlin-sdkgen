package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingTransactionFleetReportedBreakdownView(
  public val fuel: InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614? = null,
  @SerialName("non_fuel")
  public val nonFuel: InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3? = null,
  public val tax: InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_reported_breakdown
 */
@Serializable(with = IssuingTransactionFleetReportedBreakdown.Serializer::class)
public class IssuingTransactionFleetReportedBreakdown(
  /**
   * Breakdown of fuel portion of the purchase.
   */
  public val fuel: InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614? = null,
  /**
   * Breakdown of non-fuel portion of the purchase.
   */
  public val nonFuel: InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3? = null,
  /**
   * Information about tax included in this transaction.
   */
  public val tax: InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87? = null,
) {
  public class Builder {
    /**
     * Breakdown of fuel portion of the purchase.
     */
    public var fuel: InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614? = null

    /**
     * Breakdown of non-fuel portion of the purchase.
     */
    public var nonFuel: InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3? = null

    /**
     * Information about tax included in this transaction.
     */
    public var tax: InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87? = null

    public fun build(): IssuingTransactionFleetReportedBreakdown = IssuingTransactionFleetReportedBreakdown(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionFleetReportedBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionFleetReportedBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionFleetReportedBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFleetReportedBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionFleetReportedBreakdown must be a JSON object")
      return IssuingTransactionFleetReportedBreakdown(
        fuel = rawObject["fuel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614?>(element) },
        nonFuel = rawObject["non_fuel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionFleetReportedBreakdownNonFuelX564913e3?>(element) },
        tax = rawObject["tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionFleetReportedBreakdownTaxX83b5fa87?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionFleetReportedBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFleetReportedBreakdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
        value.nonFuel?.let { put("non_fuel", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionFleetReportedBreakdown(block: IssuingTransactionFleetReportedBreakdown.Builder.() -> Unit): IssuingTransactionFleetReportedBreakdown = IssuingTransactionFleetReportedBreakdown.build(block)
