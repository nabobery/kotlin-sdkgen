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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-contributor-approval.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-contributor-approval
 */
@Serializable(with = ActionsForkPrContributorApproval.Serializer::class)
public class ActionsForkPrContributorApproval(
  /**
   * The policy that controls when fork PR workflows require approval from a maintainer.
   */
  public val approvalPolicy: InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb,
) {
  public class Builder {
    private var approvalPolicyValue: InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb?
        = null

    public var approvalPolicy: InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb
      get() = requireNotNull(approvalPolicyValue) { "approvalPolicy is required" }
      set(`value`) {
        approvalPolicyValue = value
      }

    public fun build(): ActionsForkPrContributorApproval {
      check(approvalPolicyValue != null) { "approvalPolicy is required" }
      return ActionsForkPrContributorApproval(
        approvalPolicy = approvalPolicy,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsForkPrContributorApproval = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsForkPrContributorApproval> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsForkPrContributorApproval {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsForkPrContributorApproval")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsForkPrContributorApproval must be a JSON object")
      val approvalPolicy = json.decodeRequired<InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb>(rawObject, "approval_policy")
      return ActionsForkPrContributorApproval(
        approvalPolicy = approvalPolicy,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsForkPrContributorApproval) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsForkPrContributorApproval")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("approval_policy", json.encodeToJsonElement(value.approvalPolicy))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsForkPrContributorApproval(block: ActionsForkPrContributorApproval.Builder.() -> Unit): ActionsForkPrContributorApproval = ActionsForkPrContributorApproval.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsForkPrContributorApproval is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
