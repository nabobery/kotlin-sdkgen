package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-status-checks/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-status-checks/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d.Serializer::class)
public class InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d(
  requiredStatusChecks: List<RepositoryRuleParamsStatusCheckConfiguration>,
  /**
   * Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take
   * effect unless at least one status check is enabled.
   */
  public val strictRequiredStatusChecksPolicy: Boolean,
  /**
   * Allow repositories and branches to be created if a check would otherwise prohibit it.
   */
  public val doNotEnforceOnCreate: Boolean? = null,
) {
  /**
   * Status checks that are required.
   */
  public val requiredStatusChecks: List<RepositoryRuleParamsStatusCheckConfiguration> =
      requiredStatusChecks.toList()

  public class Builder {
    private var requiredStatusChecksValue: List<RepositoryRuleParamsStatusCheckConfiguration>? =
        null

    public var requiredStatusChecks: List<RepositoryRuleParamsStatusCheckConfiguration>
      get() = requireNotNull(requiredStatusChecksValue) { "requiredStatusChecks is required" }.toList()
      set(`value`) {
        requiredStatusChecksValue = value.toList()
      }

    private var strictRequiredStatusChecksPolicyValue: Boolean? = null

    public var strictRequiredStatusChecksPolicy: Boolean
      get() = requireNotNull(strictRequiredStatusChecksPolicyValue) { "strictRequiredStatusChecksPolicy is required" }
      set(`value`) {
        strictRequiredStatusChecksPolicyValue = value
      }

    /**
     * Allow repositories and branches to be created if a check would otherwise prohibit it.
     */
    public var doNotEnforceOnCreate: Boolean? = null

    public fun build(): InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d {
      check(requiredStatusChecksValue != null) { "requiredStatusChecks is required" }
      check(strictRequiredStatusChecksPolicyValue != null) { "strictRequiredStatusChecksPolicy is required" }
      return InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d(
        requiredStatusChecks = requiredStatusChecks,
        strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy,
        doNotEnforceOnCreate = doNotEnforceOnCreate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d must be a JSON object")
      val requiredStatusChecks = json.decodeRequired<List<RepositoryRuleParamsStatusCheckConfiguration>>(rawObject, "required_status_checks")
      val strictRequiredStatusChecksPolicy = json.decodeRequired<Boolean>(rawObject, "strict_required_status_checks_policy")
      return InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d(
        requiredStatusChecks = requiredStatusChecks,
        strictRequiredStatusChecksPolicy = strictRequiredStatusChecksPolicy,
        doNotEnforceOnCreate = rawObject["do_not_enforce_on_create"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("required_status_checks", json.encodeToJsonElement(value.requiredStatusChecks))
        put("strict_required_status_checks_policy", json.encodeToJsonElement(value.strictRequiredStatusChecksPolicy))
        value.doNotEnforceOnCreate?.let { put("do_not_enforce_on_create", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d(block: InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d.Builder.() -> Unit): InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d = InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleRequiredStatusChecksParametersX0a16c23d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
