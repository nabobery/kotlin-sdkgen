package com.nabobery.sdkgen.generated.stripe

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
 * A hash of settings for this cash balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cash_balance/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema/properties/settings
 */
@Serializable(with = InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721.Serializer::class)
public class InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721(
  public val reconciliationMode:
      InlineV1CustomersCashBalancePostRequestFormSettingsReconciliationModeX3799c038? = null,
) {
  public class Builder {
    public var reconciliationMode:
        InlineV1CustomersCashBalancePostRequestFormSettingsReconciliationModeX3799c038? = null

    public fun build(): InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721 = InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721(
      reconciliationMode = reconciliationMode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721 must be a JSON object")
      return InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721(
        reconciliationMode = rawObject["reconciliation_mode"]?.let { json.decodeFromJsonElement<InlineV1CustomersCashBalancePostRequestFormSettingsReconciliationModeX3799c038>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reconciliationMode?.let { put("reconciliation_mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersCashBalancePostRequestFormSettingsXb5781721(block: InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721.Builder.() -> Unit): InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721 = InlineV1CustomersCashBalancePostRequestFormSettingsXb5781721.build(block)
