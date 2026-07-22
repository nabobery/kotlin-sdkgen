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
 * admin_enforced.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * admin_enforced
 */
@Serializable(with = InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9.Serializer::class)
public class InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9(
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

    public fun build(): InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 {
      check(fromState !== FieldState.Absent) { "from is required, even when null" }
      return InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9(
        from = fromState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 must be a JSON object")
      if (!rawObject.containsKey("from")) {
        throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 is missing required property 'from'")
      }
      val from = rawObject["from"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      return InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9(block: InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9.Builder.() -> Unit): InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 = InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookBranchProtectionRuleEditedChangesAdminEnforcedX4564c6b9 property '" + name + "' is not nullable")
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
