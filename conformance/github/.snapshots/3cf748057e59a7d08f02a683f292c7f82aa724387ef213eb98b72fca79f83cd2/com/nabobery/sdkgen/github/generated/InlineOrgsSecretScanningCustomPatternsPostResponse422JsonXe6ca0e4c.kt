package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/422/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/422/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c.Serializer::class)
public class InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c(
  /**
   * A summary message describing the error.
   */
  public val message: String? = null,
  /**
   * A map of validation errors keyed by the zero-based index of the pattern that failed.
   */
  public val validationErrors:
      Map<String, InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350>? = null,
) {
  public class Builder {
    /**
     * A summary message describing the error.
     */
    public var message: String? = null

    /**
     * A map of validation errors keyed by the zero-based index of the pattern that failed.
     */
    public var validationErrors:
        Map<String, InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350>? =
        null

    public fun build(): InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c = InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c(
      message = message,
      validationErrors = validationErrors,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c must be a JSON object")
      return InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        validationErrors = rawObject["validation_errors"]?.let { json.decodeFromJsonElement<Map<String, InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
        value.validationErrors?.let { put("validation_errors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c(block: InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c.Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c = InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c.build(block)
