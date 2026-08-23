package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata
 */
@Serializable(with = InlineRepositoryRuleViolationErrorMetadataXb221a4a2.Serializer::class)
public class InlineRepositoryRuleViolationErrorMetadataXb221a4a2(
  public val secretScanning:
      InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf? = null,
) {
  public class Builder {
    public var secretScanning: InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf? =
        null

    public fun build(): InlineRepositoryRuleViolationErrorMetadataXb221a4a2 = InlineRepositoryRuleViolationErrorMetadataXb221a4a2(
      secretScanning = secretScanning,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleViolationErrorMetadataXb221a4a2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleViolationErrorMetadataXb221a4a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleViolationErrorMetadataXb221a4a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleViolationErrorMetadataXb221a4a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleViolationErrorMetadataXb221a4a2 must be a JSON object")
      return InlineRepositoryRuleViolationErrorMetadataXb221a4a2(
        secretScanning = rawObject["secret_scanning"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleViolationErrorMetadataXb221a4a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleViolationErrorMetadataXb221a4a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.secretScanning?.let { put("secret_scanning", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleViolationErrorMetadataXb221a4a2(block: InlineRepositoryRuleViolationErrorMetadataXb221a4a2.Builder.() -> Unit): InlineRepositoryRuleViolationErrorMetadataXb221a4a2 = InlineRepositoryRuleViolationErrorMetadataXb221a4a2.build(block)
