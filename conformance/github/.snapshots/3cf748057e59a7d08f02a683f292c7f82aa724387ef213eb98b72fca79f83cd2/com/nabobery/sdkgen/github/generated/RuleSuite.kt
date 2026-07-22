package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/rule-suite
 */
@Serializable(with = RuleSuite.Serializer::class)
public class RuleSuite(
  /**
   * The number that identifies the user.
   */
  public val actorId: Int? = null,
  /**
   * The handle for the GitHub user account.
   */
  public val actorName: String? = null,
  /**
   * The new commit SHA of the ref.
   */
  public val afterSha: String? = null,
  /**
   * The previous commit SHA of the ref.
   */
  public val beforeSha: String? = null,
  /**
   * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
   * whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate`
   * enforcement status were run.
   */
  public val evaluationResult: InlineRuleSuiteEvaluationResultXe5feca33? = null,
  /**
   * The unique identifier of the rule insight.
   */
  public val id: Int? = null,
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
  public val result: InlineRuleSuiteResultX0396aaab? = null,
  /**
   * Details on the evaluated rules.
   */
  public val ruleEvaluations: List<InlineRuleSuiteRuleEvaluationsItemX419ab29d>? = null,
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
     * The new commit SHA of the ref.
     */
    public var afterSha: String? = null

    /**
     * The previous commit SHA of the ref.
     */
    public var beforeSha: String? = null

    /**
     * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating
     * whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate`
     * enforcement status were run.
     */
    public var evaluationResult: InlineRuleSuiteEvaluationResultXe5feca33? = null

    /**
     * The unique identifier of the rule insight.
     */
    public var id: Int? = null

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
    public var result: InlineRuleSuiteResultX0396aaab? = null

    /**
     * Details on the evaluated rules.
     */
    public var ruleEvaluations: List<InlineRuleSuiteRuleEvaluationsItemX419ab29d>? = null

    public fun build(): RuleSuite = RuleSuite(
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
      ruleEvaluations = ruleEvaluations,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RuleSuite = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RuleSuite> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RuleSuite {
      val jsonDecoder = decoder.requireJsonDecoder("RuleSuite")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RuleSuite must be a JSON object")
      return RuleSuite(
        actorId = rawObject["actor_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        actorName = rawObject["actor_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        afterSha = rawObject["after_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        beforeSha = rawObject["before_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        evaluationResult = rawObject["evaluation_result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRuleSuiteEvaluationResultXe5feca33?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        pushedAt = rawObject["pushed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        repositoryId = rawObject["repository_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        repositoryName = rawObject["repository_name"]?.let { json.decodeFromJsonElement<String>(it) },
        result = rawObject["result"]?.let { json.decodeFromJsonElement<InlineRuleSuiteResultX0396aaab>(it) },
        ruleEvaluations = rawObject["rule_evaluations"]?.let { json.decodeFromJsonElement<List<InlineRuleSuiteRuleEvaluationsItemX419ab29d>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RuleSuite) {
      val jsonEncoder = encoder.requireJsonEncoder("RuleSuite")
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
        value.ruleEvaluations?.let { put("rule_evaluations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun ruleSuite(block: RuleSuite.Builder.() -> Unit): RuleSuite = RuleSuite.build(block)
