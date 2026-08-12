package com.nabobery.sdkgen.github.generated

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
 * required_status_checks_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * required_status_checks_enforcement_level
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae.Serializer::class)
public class InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae(
  public val from: InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477,
) {
  public class Builder {
    private var fromValue:
        InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477? = null

    public var from: InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae {
      check(fromValue != null) { "from is required" }
      return InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae must be a JSON object")
      val from = json.decodeRequired<InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722FromXfb894477>(rawObject, "from")
      return InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae(block: InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae.Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae = InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesRequiredStatusChecks8722X354a16ae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
