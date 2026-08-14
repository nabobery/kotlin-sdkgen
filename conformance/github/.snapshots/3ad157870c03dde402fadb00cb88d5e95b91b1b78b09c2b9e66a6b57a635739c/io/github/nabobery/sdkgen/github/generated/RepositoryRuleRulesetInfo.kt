package io.github.nabobery.sdkgen.github.generated

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
 * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-ruleset-info
 */
@Serializable(with = RepositoryRuleRulesetInfo.Serializer::class)
public class RepositoryRuleRulesetInfo(
  /**
   * The ID of the ruleset that includes this rule.
   */
  public val rulesetId: Int? = null,
  /**
   * The name of the source of the ruleset that includes this rule.
   */
  public val rulesetSource: String? = null,
  /**
   * The type of source for the ruleset that includes this rule.
   */
  public val rulesetSourceType: InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590? = null,
) {
  public class Builder {
    /**
     * The ID of the ruleset that includes this rule.
     */
    public var rulesetId: Int? = null

    /**
     * The name of the source of the ruleset that includes this rule.
     */
    public var rulesetSource: String? = null

    /**
     * The type of source for the ruleset that includes this rule.
     */
    public var rulesetSourceType: InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590? = null

    public fun build(): RepositoryRuleRulesetInfo = RepositoryRuleRulesetInfo(
      rulesetId = rulesetId,
      rulesetSource = rulesetSource,
      rulesetSourceType = rulesetSourceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleRulesetInfo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleRulesetInfo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleRulesetInfo {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleRulesetInfo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleRulesetInfo must be a JSON object")
      return RepositoryRuleRulesetInfo(
        rulesetId = rawObject["ruleset_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        rulesetSource = rawObject["ruleset_source"]?.let { json.decodeFromJsonElement<String>(it) },
        rulesetSourceType = rawObject["ruleset_source_type"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRulesetInfoRulesetSourceTypeX7794d590>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleRulesetInfo) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleRulesetInfo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.rulesetId?.let { put("ruleset_id", json.encodeToJsonElement(it)) }
        value.rulesetSource?.let { put("ruleset_source", it) }
        value.rulesetSourceType?.let { put("ruleset_source_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleRulesetInfo(block: RepositoryRuleRulesetInfo.Builder.() -> Unit): RepositoryRuleRulesetInfo = RepositoryRuleRulesetInfo.build(block)
