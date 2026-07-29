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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_mandate_notification_acss_debit_data
 */
@Serializable(with = SourceMandateNotificationAcssDebitData.Serializer::class)
public class SourceMandateNotificationAcssDebitData(
  /**
   * The statement descriptor associate with the debit.
   */
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    /**
     * The statement descriptor associate with the debit.
     */
    public var statementDescriptor: String? = null

    public fun build(): SourceMandateNotificationAcssDebitData = SourceMandateNotificationAcssDebitData(
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceMandateNotificationAcssDebitData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceMandateNotificationAcssDebitData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceMandateNotificationAcssDebitData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceMandateNotificationAcssDebitData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceMandateNotificationAcssDebitData must be a JSON object")
      return SourceMandateNotificationAcssDebitData(
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceMandateNotificationAcssDebitData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceMandateNotificationAcssDebitData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceMandateNotificationAcssDebitData(block: SourceMandateNotificationAcssDebitData.Builder.() -> Unit): SourceMandateNotificationAcssDebitData = SourceMandateNotificationAcssDebitData.build(block)
