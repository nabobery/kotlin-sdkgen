package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineReposIssuesPostRequestJsonX150ba9ed.Serializer::class)
public class InlineReposIssuesPostRequestJsonX150ba9ed(
  /**
   * The title of the issue.
   */
  public val title: InlineReposIssuesPostRequestJsonTitleXdfa84f11,
  /**
   * Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee
   * for new issues. The assignee is silently dropped otherwise. **This field is closing down.**_
   */
  public val assignee: String? = null,
  /**
   * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues.
   * Assignees are silently dropped otherwise._
   */
  public val assignees: List<String>? = null,
  /**
   * The contents of the issue.
   */
  public val body: String? = null,
  /**
   * An array of issue field values to set on this issue. Each field value must include the field ID and the value to
   * set. Issue fields are only available for organization-owned repositories with the feature enabled. Field values are
   * silently dropped otherwise.
   */
  public val issueFieldValues:
      List<InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03>? = null,
  /**
   * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are
   * silently dropped otherwise._
   */
  public val labels: List<InlineReposIssuesPostRequestJsonLabelsItemX3916d72d>? = null,
  public val milestone: InlineReposIssuesPostRequestJsonMilestoneXa44fb93b? = null,
  /**
   * The name of the issue type to associate with this issue. _NOTE: Only users with push access can set the type for
   * new issues. The type is silently dropped otherwise._
   */
  public val type: String? = null,
) {
  public class Builder {
    private var titleValue: InlineReposIssuesPostRequestJsonTitleXdfa84f11? = null

    public var title: InlineReposIssuesPostRequestJsonTitleXdfa84f11
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee
     * for new issues. The assignee is silently dropped otherwise. **This field is closing down.**_
     */
    public var assignee: String? = null

    /**
     * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues.
     * Assignees are silently dropped otherwise._
     */
    public var assignees: List<String>? = null

    /**
     * The contents of the issue.
     */
    public var body: String? = null

    /**
     * An array of issue field values to set on this issue. Each field value must include the field ID and the value to
     * set. Issue fields are only available for organization-owned repositories with the feature enabled. Field values
     * are silently dropped otherwise.
     */
    public var issueFieldValues:
        List<InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03>? = null

    /**
     * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are
     * silently dropped otherwise._
     */
    public var labels: List<InlineReposIssuesPostRequestJsonLabelsItemX3916d72d>? = null

    public var milestone: InlineReposIssuesPostRequestJsonMilestoneXa44fb93b? = null

    /**
     * The name of the issue type to associate with this issue. _NOTE: Only users with push access can set the type for
     * new issues. The type is silently dropped otherwise._
     */
    public var type: String? = null

    public fun build(): InlineReposIssuesPostRequestJsonX150ba9ed {
      check(titleValue != null) { "title is required" }
      return InlineReposIssuesPostRequestJsonX150ba9ed(
        title = title,
        assignee = assignee,
        assignees = assignees,
        body = body,
        issueFieldValues = issueFieldValues,
        labels = labels,
        milestone = milestone,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPostRequestJsonX150ba9ed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesPostRequestJsonX150ba9ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPostRequestJsonX150ba9ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPostRequestJsonX150ba9ed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPostRequestJsonX150ba9ed must be a JSON object")
      val title = json.decodeRequired<InlineReposIssuesPostRequestJsonTitleXdfa84f11>(rawObject, "title")
      return InlineReposIssuesPostRequestJsonX150ba9ed(
        title = title,
        assignee = rawObject["assignee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        assignees = rawObject["assignees"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        issueFieldValues = rawObject["issue_field_values"]?.let { json.decodeFromJsonElement<List<InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03>>(it) },
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<InlineReposIssuesPostRequestJsonLabelsItemX3916d72d>>(it) },
        milestone = rawObject["milestone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReposIssuesPostRequestJsonMilestoneXa44fb93b?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPostRequestJsonX150ba9ed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPostRequestJsonX150ba9ed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", json.encodeToJsonElement(value.title))
        value.assignee?.let { put("assignee", it) }
        value.assignees?.let { put("assignees", json.encodeToJsonElement(it)) }
        value.body?.let { put("body", it) }
        value.issueFieldValues?.let { put("issue_field_values", json.encodeToJsonElement(it)) }
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
        value.milestone?.let { put("milestone", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPostRequestJsonX150ba9ed(block: InlineReposIssuesPostRequestJsonX150ba9ed.Builder.() -> Unit): InlineReposIssuesPostRequestJsonX150ba9ed = InlineReposIssuesPostRequestJsonX150ba9ed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesPostRequestJsonX150ba9ed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
