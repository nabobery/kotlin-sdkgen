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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/422/content/applic
 * ation~1json/schema/properties/validation_errors/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/422/content/applic
 * ation~1json/schema/properties/validation_errors/additionalProperties
 */
@Serializable(with = InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350.Serializer::class)
public class InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350(
  errors: List<SecretScanningCustomPatternValidationError>? = null,
) {
  /**
   * List of validation errors for this pattern.
   */
  public val errors: List<SecretScanningCustomPatternValidationError>? =
      errors?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var errorsValue: List<SecretScanningCustomPatternValidationError>? = null

    /**
     * List of validation errors for this pattern.
     */
    public var errors: List<SecretScanningCustomPatternValidationError>?
      get() = errorsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        errorsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350 = InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350(
      errors = errors,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350 must be a JSON object")
      return InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350(
        errors = rawObject["errors"]?.let { json.decodeFromJsonElement<List<SecretScanningCustomPatternValidationError>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.errors?.let { put("errors", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350(block: InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350.Builder.() -> Unit): InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350 = InlineOrgsSecretScanningCu1a57PostResponse422JsonAdditionalValueX196c3350.build(block)
