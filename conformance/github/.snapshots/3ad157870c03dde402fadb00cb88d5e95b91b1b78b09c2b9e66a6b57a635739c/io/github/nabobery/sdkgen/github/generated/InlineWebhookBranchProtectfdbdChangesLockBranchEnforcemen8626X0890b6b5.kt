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
 * lock_branch_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * lock_branch_enforcement_level
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5.Serializer::class)
public class InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5(
  public val from: InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d,
) {
  public class Builder {
    private var fromValue:
        InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d? = null

    public var from: InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626FromX151d390d>(rawObject, "from")
      return InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5(block: InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5.Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 = InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesLockBranchEnforcemen8626X0890b6b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
