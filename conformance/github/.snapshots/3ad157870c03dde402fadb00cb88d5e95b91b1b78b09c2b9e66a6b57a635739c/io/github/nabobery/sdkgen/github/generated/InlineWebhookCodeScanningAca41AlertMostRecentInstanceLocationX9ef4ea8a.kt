package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance/properties/location.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance/properties/location
 */
@Serializable(with = InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a.Serializer::class)
public class InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a(
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

    public fun build(): InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a = InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a(
      endColumn = endColumn,
      endLine = endLine,
      path = path,
      startColumn = startColumn,
      startLine = startLine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a must be a JSON object")
      return InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a(
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        endLine = rawObject["end_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a")
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

public fun inlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a(block: InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a.Builder.() -> Unit): InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a = InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a.build(block)
