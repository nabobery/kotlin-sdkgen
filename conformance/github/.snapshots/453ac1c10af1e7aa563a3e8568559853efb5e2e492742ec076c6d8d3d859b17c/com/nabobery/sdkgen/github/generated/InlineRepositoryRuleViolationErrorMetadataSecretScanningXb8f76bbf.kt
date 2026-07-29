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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata/properties/secre
 * t_scanning.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata/properties/secre
 * t_scanning
 */
@Serializable(with = InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf.Serializer::class)
public class InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf(
  bypassPlaceholders: List<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9>? = null,
) {
  public val bypassPlaceholders:
      List<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9>? =
      bypassPlaceholders?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var bypassPlaceholdersValue:
        List<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9>? = null

    public var bypassPlaceholders:
        List<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9>?
      get() = bypassPlaceholdersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        bypassPlaceholdersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf = InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf(
      bypassPlaceholders = bypassPlaceholders,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf must be a JSON object")
      return InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf(
        bypassPlaceholders = rawObject["bypass_placeholders"]?.let { json.decodeFromJsonElement<List<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bypassPlaceholders?.let { put("bypass_placeholders", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf(block: InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf.Builder.() -> Unit): InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf = InlineRepositoryRuleViolationErrorMetadataSecretScanningXb8f76bbf.build(block)
