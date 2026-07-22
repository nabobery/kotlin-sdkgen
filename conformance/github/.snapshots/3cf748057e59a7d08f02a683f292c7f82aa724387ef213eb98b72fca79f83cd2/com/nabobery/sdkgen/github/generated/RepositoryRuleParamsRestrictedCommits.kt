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
import kotlinx.serialization.json.put

/**
 * Restricted commit
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-restricted-commits
 */
@Serializable(with = RepositoryRuleParamsRestrictedCommits.Serializer::class)
public class RepositoryRuleParamsRestrictedCommits(
  /**
   * Full or abbreviated commit hash to reject
   */
  public val oid: String,
  /**
   * Reason for restriction
   */
  public val reason: String? = null,
) {
  public class Builder {
    private var oidValue: String? = null

    public var oid: String
      get() = requireNotNull(oidValue) { "oid is required" }
      set(`value`) {
        oidValue = value
      }

    /**
     * Reason for restriction
     */
    public var reason: String? = null

    public fun build(): RepositoryRuleParamsRestrictedCommits {
      check(oidValue != null) { "oid is required" }
      return RepositoryRuleParamsRestrictedCommits(
        oid = oid,
        reason = reason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsRestrictedCommits = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleParamsRestrictedCommits> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsRestrictedCommits {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsRestrictedCommits")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsRestrictedCommits must be a JSON object")
      val oid = json.decodeRequired<String>(rawObject, "oid")
      return RepositoryRuleParamsRestrictedCommits(
        oid = oid,
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsRestrictedCommits) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsRestrictedCommits")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("oid", value.oid)
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsRestrictedCommits(block: RepositoryRuleParamsRestrictedCommits.Builder.() -> Unit): RepositoryRuleParamsRestrictedCommits = RepositoryRuleParamsRestrictedCommits.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsRestrictedCommits is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
