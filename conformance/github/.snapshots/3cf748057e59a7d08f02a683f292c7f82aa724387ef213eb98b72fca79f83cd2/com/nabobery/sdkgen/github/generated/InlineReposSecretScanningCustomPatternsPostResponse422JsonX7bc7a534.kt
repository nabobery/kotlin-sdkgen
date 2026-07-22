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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/responses/422/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/responses/422/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534.Serializer::class)
public class InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534(
  /**
   * A summary message describing the error.
   */
  public val message: String? = null,
  /**
   * A map of validation errors keyed by the zero-based index of the pattern that failed.
   */
  public val validationErrors:
      Map<String, InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63>? = null,
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
        Map<String, InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63>? =
        null

    public fun build(): InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534 = InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534(
      message = message,
      validationErrors = validationErrors,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534 must be a JSON object")
      return InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        validationErrors = rawObject["validation_errors"]?.let { json.decodeFromJsonElement<Map<String, InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
        value.validationErrors?.let { put("validation_errors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534(block: InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534.Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534 = InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534.build(block)
