package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_pix
 */
@Serializable(with = MandatePix.Serializer::class)
public class MandatePix(
  /**
   * Determines if the amount includes the IOF tax.
   */
  public val amountIncludesIof: InlineMandatePixAmountIncludesIofXd4d6fdc7? = null,
  /**
   * Type of amount.
   */
  public val amountType: InlineMandatePixAmountTypeXa2eae642? = null,
  /**
   * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
   */
  public val endDate: String? = null,
  /**
   * Schedule at which the future payments will be charged.
   */
  public val paymentSchedule: InlineMandatePixPaymentScheduleX3970c16e? = null,
  /**
   * Subscription name displayed to buyers in their bank app.
   */
  public val reference: String? = null,
  /**
   * Start date of the mandate, in `YYYY-MM-DD`.
   */
  public val startDate: String? = null,
) {
  public class Builder {
    /**
     * Determines if the amount includes the IOF tax.
     */
    public var amountIncludesIof: InlineMandatePixAmountIncludesIofXd4d6fdc7? = null

    /**
     * Type of amount.
     */
    public var amountType: InlineMandatePixAmountTypeXa2eae642? = null

    /**
     * Date when the mandate expires and no further payments will be charged, in `YYYY-MM-DD`.
     */
    public var endDate: String? = null

    /**
     * Schedule at which the future payments will be charged.
     */
    public var paymentSchedule: InlineMandatePixPaymentScheduleX3970c16e? = null

    /**
     * Subscription name displayed to buyers in their bank app.
     */
    public var reference: String? = null

    /**
     * Start date of the mandate, in `YYYY-MM-DD`.
     */
    public var startDate: String? = null

    public fun build(): MandatePix = MandatePix(
      amountIncludesIof = amountIncludesIof,
      amountType = amountType,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      reference = reference,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandatePix = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MandatePix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandatePix {
      val jsonDecoder = decoder.requireJsonDecoder("MandatePix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandatePix must be a JSON object")
      return MandatePix(
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineMandatePixAmountIncludesIofXd4d6fdc7>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineMandatePixAmountTypeXa2eae642>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineMandatePixPaymentScheduleX3970c16e>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandatePix) {
      val jsonEncoder = encoder.requireJsonEncoder("MandatePix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.startDate?.let { put("start_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandatePix(block: MandatePix.Builder.() -> Unit): MandatePix = MandatePix.build(block)
