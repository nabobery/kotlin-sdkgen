package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-sarifs-status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-sarifs-status
 */
@Serializable(with = CodeScanningSarifsStatus.Serializer::class)
public class CodeScanningSarifsStatus(
  /**
   * The REST API URL for getting the analyses associated with the upload.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val analysesUrl: String? = null,
  errors: List<String>? = null,
  /**
   * `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored.
   * `failed` files have either not been processed at all, or could only be partially processed.
   */
  public val processingStatus: InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f? = null,
) {
  /**
   * Any errors that ocurred during processing of the delivery.
   */
  public val errors: List<String>? = errors?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The REST API URL for getting the analyses associated with the upload.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var analysesUrl: String? = null

    private var errorsValue: List<String>? = null

    /**
     * Any errors that ocurred during processing of the delivery.
     */
    public var errors: List<String>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored.
     * `failed` files have either not been processed at all, or could only be partially processed.
     */
    public var processingStatus: InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f? = null

    public fun build(): CodeScanningSarifsStatus = CodeScanningSarifsStatus(
      analysesUrl = analysesUrl,
      errors = errors,
      processingStatus = processingStatus,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningSarifsStatus = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningSarifsStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningSarifsStatus {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningSarifsStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningSarifsStatus must be a JSON object")
      return CodeScanningSarifsStatus(
        analysesUrl = rawObject["analyses_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        errors = rawObject["errors"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        processingStatus = rawObject["processing_status"]?.let { json.decodeFromJsonElement<InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningSarifsStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningSarifsStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.analysesUrl?.let { put("analyses_url", it) }
        value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
        value.processingStatus?.let { put("processing_status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningSarifsStatus(block: CodeScanningSarifsStatus.Builder.() -> Unit): CodeScanningSarifsStatus = CodeScanningSarifsStatus.build(block)
