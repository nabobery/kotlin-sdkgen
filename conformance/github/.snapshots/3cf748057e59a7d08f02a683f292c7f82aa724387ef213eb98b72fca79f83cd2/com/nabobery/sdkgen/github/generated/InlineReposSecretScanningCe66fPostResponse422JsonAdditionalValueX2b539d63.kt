package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * tent/application~1json/schema/properties/validation_errors/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/responses/422/con
 * tent/application~1json/schema/properties/validation_errors/additionalProperties
 */
@Serializable(with = InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63.Serializer::class)
public class InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63(
  /**
   * List of validation errors for this pattern.
   */
  public val errors: List<SecretScanningCustomPatternValidationError>? = null,
) {
  public class Builder {
    /**
     * List of validation errors for this pattern.
     */
    public var errors: List<SecretScanningCustomPatternValidationError>? = null

    public fun build(): InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63 = InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63(
      errors = errors,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63 must be a JSON object")
      return InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63(
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<SecretScanningCustomPatternValidationError>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63(block: InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63.Builder.() -> Unit): InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63 = InlineReposSecretScanningCe66fPostResponse422JsonAdditionalValueX2b539d63.build(block)
