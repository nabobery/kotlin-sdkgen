package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/most
 * _recent_instance/properties/location.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-created/properties/alert/properties/most
 * _recent_instance/properties/location
 */
@Serializable(with = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03.Serializer::class)
public class InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03(
  public val endColumn: Int? = null,
  public val endLine: Int? = null,
  public val path: String? = null,
  public val startColumn: Int? = null,
  public val startLine: Int? = null,
) {
  public class Builder {
    public var endColumn: Int? = null

    public var endLine: Int? = null

    public var path: String? = null

    public var startColumn: Int? = null

    public var startLine: Int? = null

    public fun build(): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03 = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03(
      endColumn = endColumn,
      endLine = endLine,
      path = path,
      startColumn = startColumn,
      startLine = startLine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03 must be a JSON object")
      return InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03(
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        endLine = rawObject["end_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.endColumn?.let { put("end_column", json.encodeToJsonElement(it)) }
        value.endLine?.let { put("end_line", json.encodeToJsonElement(it)) }
        value.path?.let { put("path", it) }
        value.startColumn?.let { put("start_column", json.encodeToJsonElement(it)) }
        value.startLine?.let { put("start_line", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03(block: InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03.Builder.() -> Unit): InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03 = InlineWebhookCodeScanningAlertCreatedAlertMostRecentInstanceLocationXb6df6c03.build(block)
