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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/most_recent_instance/properties/location.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-appeared-in-branch/properties/alert/prop
 * erties/most_recent_instance/properties/location
 */
@Serializable(with = InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00.Serializer::class)
public class InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00(
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

    public fun build(): InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00 = InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00(
      endColumn = endColumn,
      endLine = endLine,
      path = path,
      startColumn = startColumn,
      startLine = startLine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00 must be a JSON object")
      return InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00(
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        endLine = rawObject["end_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00")
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

public fun inlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00(block: InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00.Builder.() -> Unit): InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00 = InlineWebhookCodeScanningA2384AlertMostRecentInstanceLocationX106c8c00.build(block)
