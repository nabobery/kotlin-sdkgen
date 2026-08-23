package com.nabobery.sdkgen.generated.stripe

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
public data class IssuingAuthorizationFleetReportedBreakdownView(
  public val fuel: InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1? = null,
  @SerialName("non_fuel")
  public val nonFuel: InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6? = null,
  public val tax: InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_reported_breakdown
 */
@Serializable(with = IssuingAuthorizationFleetReportedBreakdown.Serializer::class)
public class IssuingAuthorizationFleetReportedBreakdown(
  /**
   * Breakdown of fuel portion of the purchase.
   */
  public val fuel: InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1? = null,
  /**
   * Breakdown of non-fuel portion of the purchase.
   */
  public val nonFuel: InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6? = null,
  /**
   * Information about tax included in this transaction.
   */
  public val tax: InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019? = null,
) {
  public class Builder {
    /**
     * Breakdown of fuel portion of the purchase.
     */
    public var fuel: InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1? = null

    /**
     * Breakdown of non-fuel portion of the purchase.
     */
    public var nonFuel: InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6? = null

    /**
     * Information about tax included in this transaction.
     */
    public var tax: InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019? = null

    public fun build(): IssuingAuthorizationFleetReportedBreakdown = IssuingAuthorizationFleetReportedBreakdown(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationFleetReportedBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingAuthorizationFleetReportedBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationFleetReportedBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationFleetReportedBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationFleetReportedBreakdown must be a JSON object")
      return IssuingAuthorizationFleetReportedBreakdown(
        fuel = rawObject["fuel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetReportedBreakdownFuelXad619ce1?>(element) },
        nonFuel = rawObject["non_fuel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetReportedBreakdownNonFuelXc3a5c3e6?>(element) },
        tax = rawObject["tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetReportedBreakdownTaxX7563a019?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationFleetReportedBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationFleetReportedBreakdown")
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

public fun issuingAuthorizationFleetReportedBreakdown(block: IssuingAuthorizationFleetReportedBreakdown.Builder.() -> Unit): IssuingAuthorizationFleetReportedBreakdown = IssuingAuthorizationFleetReportedBreakdown.build(block)
