package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0NoMatchException(
  message: String,
) : InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0DecodingException(message)

public class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0AmbiguityException(
  message: String,
) : InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0DecodingException(message)

public class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0BranchValidationException(
  message: String,
) : InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/requested_reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/requested_reviewers/items
 */
@Serializable(with = InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0Serializer::class)
public sealed interface InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c internal constructor(
    public val id: Int,
    public val login: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Int, login: String): InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
          put("login", login)
        }
        val inspection = inspectInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0(raw)
        if (inspection.size == 0) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0NoMatchException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0BranchValidationException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0AmbiguityException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c(
          id = id,
          login = login,
          raw = raw,
        )
      }
    }
  }

  public class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5 internal constructor(
    public val description: String?,
    public val htmlUrl: String,
    public val id: Int,
    public val membersUrl: String,
    public val name: String,
    public val nodeId: String,
    public val permission: String,
    public val privacy:
        InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemPrivacyXe7fbaac8,
    public val repositoriesUrl: String,
    public val slug: String,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        description: String?,
        htmlUrl: String,
        id: Int,
        membersUrl: String,
        name: String,
        nodeId: String,
        permission: String,
        privacy: InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemPrivacyXe7fbaac8,
        repositoriesUrl: String,
        slug: String,
        url: String,
      ): InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5 {
        val raw = buildJsonObject {
          put("description", description)
          put("html_url", htmlUrl)
          put("id", SdkJson.encodeToJsonElement(id))
          put("members_url", membersUrl)
          put("name", name)
          put("node_id", nodeId)
          put("permission", permission)
          put("privacy", SdkJson.encodeToJsonElement(privacy))
          put("repositories_url", repositoriesUrl)
          put("slug", slug)
          put("url", url)
        }
        val inspection = inspectInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0(raw)
        if (inspection.size == 0) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0NoMatchException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0BranchValidationException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0AmbiguityException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5(
          description = description,
          htmlUrl = htmlUrl,
          id = id,
          membersUrl = membersUrl,
          name = name,
          nodeId = nodeId,
          permission = permission,
          privacy = privacy,
          repositoriesUrl = repositoriesUrl,
          slug = slug,
          url = url,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0Serializer : KSerializer<InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 {
    val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0NoMatchException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched 0 branches: expected JSON object")
    val matches = inspectInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0(rawObject)
    if (matches.size == 0) {
      throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0NoMatchException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0AmbiguityException("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches -> InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0.InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c(id = requireNotNull(matches.id), login = requireNotNull(matches.login), raw = rawObject)
      matches.inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches -> InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0.InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5(description = matches.description, htmlUrl = requireNotNull(matches.htmlUrl), id = requireNotNull(matches.id), membersUrl = requireNotNull(matches.membersUrl), name = requireNotNull(matches.name), nodeId = requireNotNull(matches.nodeId), permission = requireNotNull(matches.permission), privacy = requireNotNull(matches.privacy), repositoriesUrl = requireNotNull(matches.repositoriesUrl), slug = requireNotNull(matches.slug), url = requireNotNull(matches.url), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0) {
    encoder.requireJsonEncoder("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0").encodeJsonElement(value.raw)
  }
}

internal data class InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0Inspection(
  public val id: Int?,
  public val idDecoded: Boolean,
  public val login: String?,
  public val loginDecoded: Boolean,
  public val description: String?,
  public val descriptionPresent: Boolean,
  public val descriptionDecoded: Boolean,
  public val htmlUrl: String?,
  public val htmlUrlDecoded: Boolean,
  public val membersUrl: String?,
  public val membersUrlDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val nodeId: String?,
  public val nodeIdDecoded: Boolean,
  public val permission: String?,
  public val permissionDecoded: Boolean,
  public val privacy:
      InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemPrivacyXe7fbaac8?,
  public val privacyDecoded: Boolean,
  public val privacyMatches: Boolean,
  public val repositoriesUrl: String?,
  public val repositoriesUrlDecoded: Boolean,
  public val slug: String?,
  public val slugDecoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches:
      Boolean,
  public val inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches:
      Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches) add("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c")
      if (inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches) add("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0(rawObject: JsonObject): InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0Inspection {
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val loginResult = rawObject["login"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val login = loginResult?.getOrNull()
  val loginDecoded = loginResult?.isSuccess == true
  val descriptionResult = rawObject["description"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val description = descriptionResult?.getOrNull()
  val descriptionPresent = rawObject.containsKey("description")
  val descriptionDecoded = descriptionResult?.isSuccess == true
  val htmlUrlResult = rawObject["html_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val htmlUrl = htmlUrlResult?.getOrNull()
  val htmlUrlDecoded = htmlUrlResult?.isSuccess == true
  val membersUrlResult = rawObject["members_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val membersUrl = membersUrlResult?.getOrNull()
  val membersUrlDecoded = membersUrlResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val nodeIdResult = rawObject["node_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val nodeId = nodeIdResult?.getOrNull()
  val nodeIdDecoded = nodeIdResult?.isSuccess == true
  val permissionResult = rawObject["permission"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val permission = permissionResult?.getOrNull()
  val permissionDecoded = permissionResult?.isSuccess == true
  val privacyResult = rawObject["privacy"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemPrivacyXe7fbaac8>(element) } }
  val privacy = privacyResult?.getOrNull()
  val privacyDecoded = privacyResult?.isSuccess == true
  val privacyMatches = (rawObject.stringValue("privacy") == "closed" || rawObject.stringValue("privacy") == "open" || rawObject.stringValue("privacy") == "secret") && privacyDecoded
  val repositoriesUrlResult = rawObject["repositories_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val repositoriesUrl = repositoriesUrlResult?.getOrNull()
  val repositoriesUrlDecoded = repositoriesUrlResult?.isSuccess == true
  val slugResult = rawObject["slug"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val slug = slugResult?.getOrNull()
  val slugDecoded = slugResult?.isSuccess == true
  val urlResult = rawObject["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches = matchesInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cBranch(rawObject) && (idDecoded && loginDecoded)
  val inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches = matchesInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Branch(rawObject) && (descriptionPresent && descriptionDecoded && htmlUrlDecoded && idDecoded && membersUrlDecoded && nameDecoded && nodeIdDecoded && permissionDecoded && privacyMatches && repositoriesUrlDecoded && slugDecoded && urlDecoded)
  return InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0Inspection(
    id = id,
    idDecoded = idDecoded,
    login = login,
    loginDecoded = loginDecoded,
    description = description,
    descriptionPresent = descriptionPresent,
    descriptionDecoded = descriptionDecoded,
    htmlUrl = htmlUrl,
    htmlUrlDecoded = htmlUrlDecoded,
    membersUrl = membersUrl,
    membersUrlDecoded = membersUrlDecoded,
    name = name,
    nameDecoded = nameDecoded,
    nodeId = nodeId,
    nodeIdDecoded = nodeIdDecoded,
    permission = permission,
    permissionDecoded = permissionDecoded,
    privacy = privacy,
    privacyDecoded = privacyDecoded,
    privacyMatches = privacyMatches,
    repositoriesUrl = repositoriesUrl,
    repositoriesUrlDecoded = repositoriesUrlDecoded,
    slug = slug,
    slugDecoded = slugDecoded,
    url = url,
    urlDecoded = urlDecoded,
    inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches = inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches,
    inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches = inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cMatches) add("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0c: branch predicate did not match properties 'id' and 'login'")
      if (!inlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Matches) add("InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5: branch predicate did not match properties 'description' and 'html_url' and 'id' and 'members_url' and 'name' and 'node_id' and 'permission' and 'privacy' and 'repositories_url' and 'slug' and 'url'")
    },
  )
}

private fun matchesInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf1X2ecd3c0cBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemXd3e87db0InlineWebhookPullRequestRe5d81PullRequestRequestedReviewersItemOneOf2X0f0f6ce5Branch(rawObject: JsonObject): Boolean = true

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
