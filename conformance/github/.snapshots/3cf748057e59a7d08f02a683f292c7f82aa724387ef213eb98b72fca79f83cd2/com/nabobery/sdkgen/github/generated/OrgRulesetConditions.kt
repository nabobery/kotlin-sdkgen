package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public class OrgRulesetConditionsView()

public sealed class OrgRulesetConditionsDecodingException(
  message: String,
) : SerializationException(message)

public class OrgRulesetConditionsNoMatchException(
  message: String,
) : OrgRulesetConditionsDecodingException(message)

public class OrgRulesetConditionsAmbiguityException(
  message: String,
) : OrgRulesetConditionsDecodingException(message)

public class OrgRulesetConditionsBranchValidationException(
  message: String,
) : OrgRulesetConditionsDecodingException(message)

/**
 * Conditions for an organization ruleset.
 * The branch and tag rulesets conditions object should contain both `repository_name` and `ref_name` properties, or
 * both `repository_id` and `ref_name` properties, or both `repository_property` and `ref_name` properties.
 * The push rulesets conditions object does not require the `ref_name` property.
 * For repository policy rulesets, the conditions object should only contain the `repository_name`, the `repository_id`,
 * or the `repository_property`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-ruleset-conditions
 */
@Serializable(with = OrgRulesetConditions.Serializer::class)
public sealed interface OrgRulesetConditions {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineOrgRulesetConditionsOneOf1X3d69f8f6 internal constructor(
    public val repositoryName:
        InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrgRulesetConditions {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(repositoryName: InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818): InlineOrgRulesetConditionsOneOf1X3d69f8f6 {
        val raw = buildJsonObject {
              put("repository_name", SdkJson.encodeToJsonElement(repositoryName))
            }
        val inspection = inspectOrgRulesetConditions(raw)
        if (inspection.size == 0) {
          throw OrgRulesetConditionsNoMatchException("OrgRulesetConditions matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches) {
          throw OrgRulesetConditionsBranchValidationException("InlineOrgRulesetConditionsOneOf1X3d69f8f6 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrgRulesetConditionsAmbiguityException("OrgRulesetConditions matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineOrgRulesetConditionsOneOf1X3d69f8f6(
          repositoryName = repositoryName,
          raw = raw,
        )
      }
    }
  }

  public class InlineOrgRulesetConditionsOneOf2X1147c8ae internal constructor(
    public val repositoryId:
        InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrgRulesetConditions {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(repositoryId: InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2): InlineOrgRulesetConditionsOneOf2X1147c8ae {
        val raw = buildJsonObject {
              put("repository_id", SdkJson.encodeToJsonElement(repositoryId))
            }
        val inspection = inspectOrgRulesetConditions(raw)
        if (inspection.size == 0) {
          throw OrgRulesetConditionsNoMatchException("OrgRulesetConditions matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineOrgRulesetConditionsOneOf2X1147c8aeMatches) {
          throw OrgRulesetConditionsBranchValidationException("InlineOrgRulesetConditionsOneOf2X1147c8ae factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrgRulesetConditionsAmbiguityException("OrgRulesetConditions matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineOrgRulesetConditionsOneOf2X1147c8ae(
          repositoryId = repositoryId,
          raw = raw,
        )
      }
    }
  }

  public class InlineOrgRulesetConditionsOneOf3X186a9b17 internal constructor(
    public val repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrgRulesetConditions {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba): InlineOrgRulesetConditionsOneOf3X186a9b17 {
        val raw = buildJsonObject {
              put("repository_property", SdkJson.encodeToJsonElement(repositoryProperty))
            }
        val inspection = inspectOrgRulesetConditions(raw)
        if (inspection.size == 0) {
          throw OrgRulesetConditionsNoMatchException("OrgRulesetConditions matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineOrgRulesetConditionsOneOf3X186a9b17Matches) {
          throw OrgRulesetConditionsBranchValidationException("InlineOrgRulesetConditionsOneOf3X186a9b17 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrgRulesetConditionsAmbiguityException("OrgRulesetConditions matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineOrgRulesetConditionsOneOf3X186a9b17(
          repositoryProperty = repositoryProperty,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<OrgRulesetConditions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrgRulesetConditions {
      val jsonDecoder = decoder.requireJsonDecoder("OrgRulesetConditions")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw OrgRulesetConditionsNoMatchException("OrgRulesetConditions matched 0 branches: expected JSON object")
      val matches = inspectOrgRulesetConditions(rawObject)
      if (matches.size == 0) {
        throw OrgRulesetConditionsNoMatchException("OrgRulesetConditions matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw OrgRulesetConditionsAmbiguityException("OrgRulesetConditions matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches -> InlineOrgRulesetConditionsOneOf1X3d69f8f6(repositoryName = requireNotNull(matches.repositoryName), raw = rawObject)
        matches.InlineOrgRulesetConditionsOneOf2X1147c8aeMatches -> InlineOrgRulesetConditionsOneOf2X1147c8ae(repositoryId = requireNotNull(matches.repositoryId), raw = rawObject)
        matches.InlineOrgRulesetConditionsOneOf3X186a9b17Matches -> InlineOrgRulesetConditionsOneOf3X186a9b17(repositoryProperty = requireNotNull(matches.repositoryProperty), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: OrgRulesetConditions) {
      encoder.requireJsonEncoder("OrgRulesetConditions").encodeJsonElement(value.raw)
    }
  }
}

internal data class OrgRulesetConditionsInspection(
  public val repositoryName:
      InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818?,
  public val repositoryNameDecoded: Boolean,
  public val repositoryId:
      InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2?,
  public val repositoryIdDecoded: Boolean,
  public val repositoryProperty: InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba?,
  public val repositoryPropertyDecoded: Boolean,
  public val InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches: Boolean,
  public val InlineOrgRulesetConditionsOneOf2X1147c8aeMatches: Boolean,
  public val InlineOrgRulesetConditionsOneOf3X186a9b17Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches) add("InlineOrgRulesetConditionsOneOf1X3d69f8f6")
      if (InlineOrgRulesetConditionsOneOf2X1147c8aeMatches) add("InlineOrgRulesetConditionsOneOf2X1147c8ae")
      if (InlineOrgRulesetConditionsOneOf3X186a9b17Matches) add("InlineOrgRulesetConditionsOneOf3X186a9b17")
    }

  public val size: Int
    get() = names.size
}

private fun inspectOrgRulesetConditions(rawObject: JsonObject): OrgRulesetConditionsInspection {
  val repositoryNameResult = rawObject["repository_name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRulesetConditionsRepositoryNameTargetRepositoryNameX43e68818>(element) } }
  val repositoryName = repositoryNameResult?.getOrNull()
  val repositoryNameDecoded = repositoryNameResult?.isSuccess == true
  val repositoryIdResult = rawObject["repository_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRulesetConditionsRepositoryIdTargetRepositoryIdXa24a9cb2>(element) } }
  val repositoryId = repositoryIdResult?.getOrNull()
  val repositoryIdDecoded = repositoryIdResult?.isSuccess == true
  val repositoryPropertyResult = rawObject["repository_property"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRulesetCon23b6RepositoryPropertyX0ae562ba>(element) } }
  val repositoryProperty = repositoryPropertyResult?.getOrNull()
  val repositoryPropertyDecoded = repositoryPropertyResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches = repositoryNameDecoded
  val InlineOrgRulesetConditionsOneOf2X1147c8aeMatches = repositoryIdDecoded
  val InlineOrgRulesetConditionsOneOf3X186a9b17Matches = repositoryPropertyDecoded
  return OrgRulesetConditionsInspection(
    repositoryName = repositoryName,
    repositoryNameDecoded = repositoryNameDecoded,
    repositoryId = repositoryId,
    repositoryIdDecoded = repositoryIdDecoded,
    repositoryProperty = repositoryProperty,
    repositoryPropertyDecoded = repositoryPropertyDecoded,
    InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches = InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches,
    InlineOrgRulesetConditionsOneOf2X1147c8aeMatches = InlineOrgRulesetConditionsOneOf2X1147c8aeMatches,
    InlineOrgRulesetConditionsOneOf3X186a9b17Matches = InlineOrgRulesetConditionsOneOf3X186a9b17Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!InlineOrgRulesetConditionsOneOf1X3d69f8f6Matches) add("InlineOrgRulesetConditionsOneOf1X3d69f8f6: branch predicate did not match properties 'repository_name'")
      if (!InlineOrgRulesetConditionsOneOf2X1147c8aeMatches) add("InlineOrgRulesetConditionsOneOf2X1147c8ae: branch predicate did not match properties 'repository_id'")
      if (!InlineOrgRulesetConditionsOneOf3X186a9b17Matches) add("InlineOrgRulesetConditionsOneOf3X186a9b17: branch predicate did not match properties 'repository_property'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
