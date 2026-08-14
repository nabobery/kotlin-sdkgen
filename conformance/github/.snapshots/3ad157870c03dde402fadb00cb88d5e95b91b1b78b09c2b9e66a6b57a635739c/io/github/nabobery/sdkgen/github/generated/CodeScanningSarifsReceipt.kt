package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-sarifs-receipt.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-sarifs-receipt
 */
@Serializable(with = CodeScanningSarifsReceipt.Serializer::class)
public class CodeScanningSarifsReceipt(
  public val id: String? = null,
  /**
   * The REST API URL for checking the status of the upload.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    public var id: String? = null

    /**
     * The REST API URL for checking the status of the upload.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): CodeScanningSarifsReceipt = CodeScanningSarifsReceipt(
      id = id,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningSarifsReceipt = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeScanningSarifsReceipt> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningSarifsReceipt {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningSarifsReceipt")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningSarifsReceipt must be a JSON object")
      return CodeScanningSarifsReceipt(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningSarifsReceipt) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningSarifsReceipt")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningSarifsReceipt(block: CodeScanningSarifsReceipt.Builder.() -> Unit): CodeScanningSarifsReceipt = CodeScanningSarifsReceipt.build(block)
