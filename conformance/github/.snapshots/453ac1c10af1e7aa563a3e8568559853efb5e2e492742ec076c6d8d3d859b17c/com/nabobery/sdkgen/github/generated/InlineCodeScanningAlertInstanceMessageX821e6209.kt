package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-instance/properties/message.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-instance/properties/message
 */
@Serializable(with = InlineCodeScanningAlertInstanceMessageX821e6209.Serializer::class)
public class InlineCodeScanningAlertInstanceMessageX821e6209(
  /**
   * The message text as GitHub-flavored Markdown, with placeholder links for related locations replaced by links to the
   * relevant code. Only populated when related locations are available for the alert instance.
   */
  public val markdown: String? = null,
  public val text: String? = null,
) {
  public class Builder {
    /**
     * The message text as GitHub-flavored Markdown, with placeholder links for related locations replaced by links to
     * the relevant code. Only populated when related locations are available for the alert instance.
     */
    public var markdown: String? = null

    public var text: String? = null

    public fun build(): InlineCodeScanningAlertInstanceMessageX821e6209 = InlineCodeScanningAlertInstanceMessageX821e6209(
      markdown = markdown,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeScanningAlertInstanceMessageX821e6209 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCodeScanningAlertInstanceMessageX821e6209> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeScanningAlertInstanceMessageX821e6209 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeScanningAlertInstanceMessageX821e6209")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeScanningAlertInstanceMessageX821e6209 must be a JSON object")
      return InlineCodeScanningAlertInstanceMessageX821e6209(
        markdown = rawObject["markdown"]?.let { json.decodeFromJsonElement<String>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningAlertInstanceMessageX821e6209) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeScanningAlertInstanceMessageX821e6209")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.markdown?.let { put("markdown", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeScanningAlertInstanceMessageX821e6209(block: InlineCodeScanningAlertInstanceMessageX821e6209.Builder.() -> Unit): InlineCodeScanningAlertInstanceMessageX821e6209 = InlineCodeScanningAlertInstanceMessageX821e6209.build(block)
