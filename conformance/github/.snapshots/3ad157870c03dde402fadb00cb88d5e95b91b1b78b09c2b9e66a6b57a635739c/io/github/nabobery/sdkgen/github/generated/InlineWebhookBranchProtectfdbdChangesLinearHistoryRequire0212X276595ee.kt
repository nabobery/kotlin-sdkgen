package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * linear_history_requirement_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * linear_history_requirement_enforcement_level
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee.Serializer::class)
public class InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee(
  public val from: InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be,
) {
  public class Builder {
    private var fromValue:
        InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be? = null

    public var from: InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee {
      check(fromValue != null) { "from is required" }
      return InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee must be a JSON object")
      val from = json.decodeRequired<InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212FromX02f5f9be>(rawObject, "from")
      return InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee(block: InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee.Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee = InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesLinearHistoryRequire0212X276595ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
