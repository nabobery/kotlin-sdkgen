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
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1/properties/rev
 * iewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1/properties/rev
 * iewers/items
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025.Serializer::class)
public class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025(
  public val reviewer:
      InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334? = null,
  public val type: DeploymentReviewerType? = null,
) {
  public class Builder {
    public var reviewer: InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334? =
        null

    public var type: DeploymentReviewerType? = null

    public fun build(): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025 = InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025(
      reviewer = reviewer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025 must be a JSON object")
      return InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025(
        reviewer = rawObject["reviewer"]?.let { json.decodeFromJsonElement<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<DeploymentReviewerType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewer?.let { put("reviewer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025(block: InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025.Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025 = InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025.build(block)
