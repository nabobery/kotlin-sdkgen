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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance/properties/location.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance/properties/location
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c.Serializer::class)
public class InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c(
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

    public fun build(): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c(
      endColumn = endColumn,
      endLine = endLine,
      path = path,
      startColumn = startColumn,
      startLine = startLine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c must be a JSON object")
      return InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c(
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        endLine = rawObject["end_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c")
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

public fun inlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c(block: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c.Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c.build(block)
