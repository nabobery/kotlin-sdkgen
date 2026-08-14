package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * required_status_checks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * required_status_checks
 */
@Serializable(with = InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0.Serializer::class)
public class InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0(
  from: List<String>,
) {
  public val from: List<String> = from.toList()

  public class Builder {
    private var fromValue: List<String>? = null

    public var from: List<String>
      get() = requireNotNull(fromValue) { "from is required" }.toList()
      set(`value`) {
        fromValue = value.toList()
      }

    public fun build(): InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 must be a JSON object")
      val from = json.decodeRequired<List<String>>(rawObject, "from")
      return InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0(block: InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0.Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 = InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesRequiredStatusChecksX2e021fd0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
