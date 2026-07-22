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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A validation error for a custom pattern in a batch operation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern-validation-error
 */
@Serializable(with = SecretScanningCustomPatternValidationError.Serializer::class)
public class SecretScanningCustomPatternValidationError(
  /**
   * A machine-readable code describing the error.
   */
  public val code: InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25? = null,
  /**
   * A human-readable description of the error.
   */
  public val message: String? = null,
) {
  public class Builder {
    /**
     * A machine-readable code describing the error.
     */
    public var code: InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25? = null

    /**
     * A human-readable description of the error.
     */
    public var message: String? = null

    public fun build(): SecretScanningCustomPatternValidationError = SecretScanningCustomPatternValidationError(
      code = code,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningCustomPatternValidationError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningCustomPatternValidationError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningCustomPatternValidationError {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningCustomPatternValidationError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningCustomPatternValidationError must be a JSON object")
      return SecretScanningCustomPatternValidationError(
        code = rawObject["code"]?.let { json.decodeFromJsonElement<InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningCustomPatternValidationError) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningCustomPatternValidationError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningCustomPatternValidationError(block: SecretScanningCustomPatternValidationError.Builder.() -> Unit): SecretScanningCustomPatternValidationError = SecretScanningCustomPatternValidationError.build(block)
