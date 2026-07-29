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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_mandate_notification_sepa_debit_data
 */
@Serializable(with = SourceMandateNotificationSepaDebitData.Serializer::class)
public class SourceMandateNotificationSepaDebitData(
  /**
   * SEPA creditor ID.
   */
  public val creditorIdentifier: String? = null,
  /**
   * Last 4 digits of the account number associated with the debit.
   */
  public val last4: String? = null,
  /**
   * Mandate reference associated with the debit.
   */
  public val mandateReference: String? = null,
) {
  public class Builder {
    /**
     * SEPA creditor ID.
     */
    public var creditorIdentifier: String? = null

    /**
     * Last 4 digits of the account number associated with the debit.
     */
    public var last4: String? = null

    /**
     * Mandate reference associated with the debit.
     */
    public var mandateReference: String? = null

    public fun build(): SourceMandateNotificationSepaDebitData = SourceMandateNotificationSepaDebitData(
      creditorIdentifier = creditorIdentifier,
      last4 = last4,
      mandateReference = mandateReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceMandateNotificationSepaDebitData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceMandateNotificationSepaDebitData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceMandateNotificationSepaDebitData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceMandateNotificationSepaDebitData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceMandateNotificationSepaDebitData must be a JSON object")
      return SourceMandateNotificationSepaDebitData(
        creditorIdentifier = rawObject["creditor_identifier"]?.let { json.decodeFromJsonElement<String>(it) },
        last4 = rawObject["last4"]?.let { json.decodeFromJsonElement<String>(it) },
        mandateReference = rawObject["mandate_reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceMandateNotificationSepaDebitData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceMandateNotificationSepaDebitData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.creditorIdentifier?.let { put("creditor_identifier", it) }
        value.last4?.let { put("last4", it) }
        value.mandateReference?.let { put("mandate_reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceMandateNotificationSepaDebitData(block: SourceMandateNotificationSepaDebitData.Builder.() -> Unit): SourceMandateNotificationSepaDebitData = SourceMandateNotificationSepaDebitData.build(block)
