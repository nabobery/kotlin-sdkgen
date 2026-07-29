package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/rule-suites/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suites/items
 */
@Serializable(with = InlineRuleSuitesItemXc3620dbe.Serializer::class)
public class InlineRuleSuitesItemXc3620dbe(
  /**
   * The number that identifies the user.
   */
  public val actorId: Int? = null,
  /**
   * The handle for the GitHub user account.
   */
  public val actorName: String? = null,
  /**
   * The last commit sha in the push evaluation.
   */
  public val afterSha: String? = null,
  /**
   * The first commit sha before the push evaluation.
   */
  public val beforeSha: String? = null,
  /**
   * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
   * whether rules would pass or fail if all rules in the rule suite were `active`.
   */
  public val evaluationResult: InlineRuleSuitesItemEvaluationResultX291b53a1? = null,
  /**
   * The unique identifier of the rule insight.
   */
  public val id: Int? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushedAt: String? = null,
  /**
   * The ref name that the evaluation ran on.
   */
  public val ref: String? = null,
  /**
   * The ID of the repository associated with the rule evaluation.
   */
  public val repositoryId: Int? = null,
  /**
   * The name of the repository without the `.git` extension.
   */
  public val repositoryName: String? = null,
  /**
   * The result of the rule evaluations for rules with the `active` enforcement status.
   */
  public val result: InlineRuleSuitesItemResultX08d7aec8? = null,
) {
  public class Builder {
    /**
     * The number that identifies the user.
     */
    public var actorId: Int? = null

    /**
     * The handle for the GitHub user account.
     */
    public var actorName: String? = null

    /**
     * The last commit sha in the push evaluation.
     */
    public var afterSha: String? = null

    /**
     * The first commit sha before the push evaluation.
     */
    public var beforeSha: String? = null

    /**
     * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
     * whether rules would pass or fail if all rules in the rule suite were `active`.
     */
    public var evaluationResult: InlineRuleSuitesItemEvaluationResultX291b53a1? = null

    /**
     * The unique identifier of the rule insight.
     */
    public var id: Int? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pushedAt: String? = null

    /**
     * The ref name that the evaluation ran on.
     */
    public var ref: String? = null

    /**
     * The ID of the repository associated with the rule evaluation.
     */
    public var repositoryId: Int? = null

    /**
     * The name of the repository without the `.git` extension.
     */
    public var repositoryName: String? = null

    /**
     * The result of the rule evaluations for rules with the `active` enforcement status.
     */
    public var result: InlineRuleSuitesItemResultX08d7aec8? = null

    public fun build(): InlineRuleSuitesItemXc3620dbe = InlineRuleSuitesItemXc3620dbe(
      actorId = actorId,
      actorName = actorName,
      afterSha = afterSha,
      beforeSha = beforeSha,
      evaluationResult = evaluationResult,
      id = id,
      pushedAt = pushedAt,
      ref = ref,
      repositoryId = repositoryId,
      repositoryName = repositoryName,
      result = result,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuitesItemXc3620dbe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRuleSuitesItemXc3620dbe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuitesItemXc3620dbe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuitesItemXc3620dbe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuitesItemXc3620dbe must be a JSON object")
      return InlineRuleSuitesItemXc3620dbe(
        actorId = rawObject["actor_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        actorName = rawObject["actor_name"]?.let { json.decodeFromJsonElement<String>(it) },
        afterSha = rawObject["after_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        beforeSha = rawObject["before_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        evaluationResult = rawObject["evaluation_result"]?.let { json.decodeFromJsonElement<InlineRuleSuitesItemEvaluationResultX291b53a1>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        pushedAt = rawObject["pushed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryName = rawObject["repository_name"]?.let { json.decodeFromJsonElement<String>(it) },
        result = rawObject["result"]?.let { json.decodeFromJsonElement<InlineRuleSuitesItemResultX08d7aec8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitesItemXc3620dbe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuitesItemXc3620dbe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actorId?.let { put("actor_id", json.encodeToJsonElement(it)) }
        value.actorName?.let { put("actor_name", it) }
        value.afterSha?.let { put("after_sha", it) }
        value.beforeSha?.let { put("before_sha", it) }
        value.evaluationResult?.let { put("evaluation_result", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.pushedAt?.let { put("pushed_at", it) }
        value.ref?.let { put("ref", it) }
        value.repositoryId?.let { put("repository_id", json.encodeToJsonElement(it)) }
        value.repositoryName?.let { put("repository_name", it) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuitesItemXc3620dbe(block: InlineRuleSuitesItemXc3620dbe.Builder.() -> Unit): InlineRuleSuitesItemXc3620dbe = InlineRuleSuitesItemXc3620dbe.build(block)
