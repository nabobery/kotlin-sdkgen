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
 * authorized_dismissal_actors_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * authorized_dismissal_actors_only
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4.Serializer::class)
public class InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4(
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

    public fun build(): InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 {
      check(fromState !== FieldState.Absent) { "from is required, even when null" }
      return InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4(
        from = fromState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 must be a JSON object")
      if (!rawObject.containsKey("from")) {
        throw SerializationException("InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 is missing required property 'from'")
      }
      val from = rawObject["from"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      return InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4(block: InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4.Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 = InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookBranchProtectfdbdChangesAuthorizedDismissalA35f8Xe10998f4 property '" + name + "' is not nullable")
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
