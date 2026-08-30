package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * require_last_push_approval.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * require_last_push_approval
 */
@Serializable(with = InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3.Serializer::class)
public class InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3(
  public val from: Boolean?,
) {
  public class Builder {
    private var fromState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var from: Boolean?
      get() = fromState.valueOrNull()
      set(`value`) {
        fromState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 {
      check(fromState !== FieldState.Absent) { "from is required, even when null" }
      return InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3(
        from = fromState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 must be a JSON object")
      if (!rawObject.containsKey("from")) {
        throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 is missing required property 'from'")
      }
      val from = rawObject["from"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      return InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3(block: InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3.Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 = InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesRequireLastPushApprovalXbd0ce2e3 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
