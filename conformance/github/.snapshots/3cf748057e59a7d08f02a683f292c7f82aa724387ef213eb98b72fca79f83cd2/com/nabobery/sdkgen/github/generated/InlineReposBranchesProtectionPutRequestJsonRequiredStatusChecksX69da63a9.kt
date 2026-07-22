package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Require status checks to pass before merging. Set to `null` to disable.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_status_checks
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9(
  contexts: List<String>,
  /**
   * Require branches to be up to date before merging.
   */
  public val strict: Boolean,
  /**
   * The list of status checks to require in order to merge into this branch.
   */
  public val checks:
      List<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c>? = null,
) {
  /**
   * **Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these
   * checks have recently been set by a particular GitHub App, they will be required to come from that app in future for
   * the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.
   */
  public val contexts: List<String> = contexts.toList()

  public class Builder {
    private var contextsValue: List<String>? = null

    public var contexts: List<String>
      get() = requireNotNull(contextsValue) { "contexts is required" }
      set(`value`) {
        contextsValue = value
      }

    private var strictValue: Boolean? = null

    public var strict: Boolean
      get() = requireNotNull(strictValue) { "strict is required" }
      set(`value`) {
        strictValue = value
      }

    /**
     * The list of status checks to require in order to merge into this branch.
     */
    public var checks:
        List<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c>? = null

    public fun build(): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 {
      check(contextsValue != null) { "contexts is required" }
      check(strictValue != null) { "strict is required" }
      return InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9(
        contexts = contexts,
        strict = strict,
        checks = checks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 must be a JSON object")
      val contexts = json.decodeRequired<List<String>>(rawObject, "contexts")
      val strict = json.decodeRequired<Boolean>(rawObject, "strict")
      return InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9(
        contexts = contexts,
        strict = strict,
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<List<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("contexts", json.encodeToJsonElement(value.contexts))
        put("strict", json.encodeToJsonElement(value.strict))
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9(block: InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 = InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksX69da63a9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
