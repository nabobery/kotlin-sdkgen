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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-push.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push
 */
@Serializable(with = WebhookPush.Serializer::class)
public class WebhookPush internal constructor(
  /**
   * The SHA of the most recent commit on `ref` after the push.
   */
  public val after: String,
  public val baseRef: String?,
  /**
   * The SHA of the most recent commit on `ref` before the push.
   */
  public val before: String,
  commits: List<InlineWebhookPushCommitsItemX88ce9531>,
  /**
   * URL that shows the changes in this `ref` update, from the `before` commit to the `after` commit. For a newly
   * created `ref` that is directly based on the default branch, this is the comparison between the head of the default
   * branch and the `after` commit. Otherwise, this shows all commits until the `after` commit.
   */
  public val compare: String,
  /**
   * Whether this push created the `ref`.
   */
  public val created: Boolean,
  /**
   * Whether this push deleted the `ref`.
   */
  public val deleted: Boolean,
  /**
   * Whether this push was a force push of the `ref`.
   */
  public val forced: Boolean,
  public val headCommit: InlineWebhookPushHeadCommitX7bf4b1dd?,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val pusher: InlineWebhookPushPusherX2fa664db,
  /**
   * The full git ref that was pushed. Example: `refs/heads/main` or `refs/tags/v3.14.1`.
   */
  public val ref: String,
  /**
   * A git repository
   */
  public val repository: InlineWebhookPushRepositoryXe37d7d2d,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  private val organizationState: FieldState<OrganizationSimpleWebhooks>,
  private val senderState: FieldState<SimpleUser>,
) {
  /**
   * An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the
   * `compare` between the `before` commit and the `after` commit.) The array includes a maximum of 2048 commits. If
   * necessary, you can use the [Commits API](https://docs.github.com/rest/commits) to fetch additional commits.
   */
  public val commits: List<InlineWebhookPushCommitsItemX88ce9531> = commits.toList()

  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public val organization: OrganizationSimpleWebhooks?
    get() = organizationState.valueOrNull()

  public val sender: SimpleUser?
    get() = senderState.valueOrNull()

  public constructor(
    after: String,
    baseRef: String?,
    before: String,
    commits: List<InlineWebhookPushCommitsItemX88ce9531>,
    compare: String,
    created: Boolean,
    deleted: Boolean,
    forced: Boolean,
    headCommit: InlineWebhookPushHeadCommitX7bf4b1dd?,
    pusher: InlineWebhookPushPusherX2fa664db,
    ref: String,
    repository: InlineWebhookPushRepositoryXe37d7d2d,
  ) : this(after = after,
  baseRef = baseRef,
  before = before,
  commits = commits,
  compare = compare,
  created = created,
  deleted = deleted,
  forced = forced,
  headCommit = headCommit,
  pusher = pusher,
  ref = ref,
  repository = repository,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  organizationState = FieldState.Absent,
  senderState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  /**
   * Returns the wire presence of `sender`.
   */
  public fun senderPresence(): FieldPresence = senderState.presence

  public class Builder {
    private var afterValue: String? = null

    public var after: String
      get() = requireNotNull(afterValue) { "after is required" }
      set(`value`) {
        afterValue = value
      }

    private var beforeValue: String? = null

    public var before: String
      get() = requireNotNull(beforeValue) { "before is required" }
      set(`value`) {
        beforeValue = value
      }

    private var commitsValue: List<InlineWebhookPushCommitsItemX88ce9531>? = null

    public var commits: List<InlineWebhookPushCommitsItemX88ce9531>
      get() = requireNotNull(commitsValue) { "commits is required" }.toList()
      set(`value`) {
        commitsValue = value.toList()
      }

    private var compareValue: String? = null

    public var compare: String
      get() = requireNotNull(compareValue) { "compare is required" }
      set(`value`) {
        compareValue = value
      }

    private var createdValue: Boolean? = null

    public var created: Boolean
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var deletedValue: Boolean? = null

    public var deleted: Boolean
      get() = requireNotNull(deletedValue) { "deleted is required" }
      set(`value`) {
        deletedValue = value
      }

    private var forcedValue: Boolean? = null

    public var forced: Boolean
      get() = requireNotNull(forcedValue) { "forced is required" }
      set(`value`) {
        forcedValue = value
      }

    private var pusherValue: InlineWebhookPushPusherX2fa664db? = null

    public var pusher: InlineWebhookPushPusherX2fa664db
      get() = requireNotNull(pusherValue) { "pusher is required" }
      set(`value`) {
        pusherValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repositoryValue: InlineWebhookPushRepositoryXe37d7d2d? = null

    public var repository: InlineWebhookPushRepositoryXe37d7d2d
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var baseRefState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var baseRef: String?
      get() = baseRefState.valueOrNull()
      set(`value`) {
        baseRefState = value.toNullableFieldState()
      }

    private var headCommitState: FieldState<InlineWebhookPushHeadCommitX7bf4b1dd?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var headCommit: InlineWebhookPushHeadCommitX7bf4b1dd?
      get() = headCommitState.valueOrNull()
      set(`value`) {
        headCommitState = value.toNullableFieldState()
      }

    private var enterpriseState: FieldState<EnterpriseWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterprise: EnterpriseWebhooks?
      get() = enterpriseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterprise is not nullable; call unsetEnterprise() to omit it" }
        enterpriseState = FieldState.Value(present)
      }

    private var installationState: FieldState<SimpleInstallation> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var installation: SimpleInstallation?
      get() = installationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "installation is not nullable; call unsetInstallation() to omit it" }
        installationState = FieldState.Value(present)
      }

    private var organizationState: FieldState<OrganizationSimpleWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organization: OrganizationSimpleWebhooks?
      get() = organizationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organization is not nullable; call unsetOrganization() to omit it" }
        organizationState = FieldState.Value(present)
      }

    private var senderState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sender: SimpleUser?
      get() = senderState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sender is not nullable; call unsetSender() to omit it" }
        senderState = FieldState.Value(present)
      }

    /**
     * Omits `enterprise` from serialized output.
     */
    public fun unsetEnterprise() {
      enterpriseState = FieldState.Absent
    }

    /**
     * Omits `installation` from serialized output.
     */
    public fun unsetInstallation() {
      installationState = FieldState.Absent
    }

    /**
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    /**
     * Omits `sender` from serialized output.
     */
    public fun unsetSender() {
      senderState = FieldState.Absent
    }

    public fun build(): WebhookPush {
      check(afterValue != null) { "after is required" }
      check(beforeValue != null) { "before is required" }
      check(commitsValue != null) { "commits is required" }
      check(compareValue != null) { "compare is required" }
      check(createdValue != null) { "created is required" }
      check(deletedValue != null) { "deleted is required" }
      check(forcedValue != null) { "forced is required" }
      check(pusherValue != null) { "pusher is required" }
      check(refValue != null) { "ref is required" }
      check(repositoryValue != null) { "repository is required" }
      check(baseRefState !== FieldState.Absent) { "baseRef is required, even when null" }
      check(headCommitState !== FieldState.Absent) { "headCommit is required, even when null" }
      return WebhookPush(
        after = after,
        baseRef = baseRefState.valueOrNull(),
        before = before,
        commits = commits,
        compare = compare,
        created = created,
        deleted = deleted,
        forced = forced,
        headCommit = headCommitState.valueOrNull(),
        pusher = pusher,
        ref = ref,
        repository = repository,
        enterpriseState = enterpriseState,
        installationState = installationState,
        organizationState = organizationState,
        senderState = senderState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPush = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPush> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPush {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPush")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPush must be a JSON object")
      val after = json.decodeRequired<String>(rawObject, "after")
      val before = json.decodeRequired<String>(rawObject, "before")
      val commits = json.decodeRequired<List<InlineWebhookPushCommitsItemX88ce9531>>(rawObject, "commits")
      val compare = json.decodeRequired<String>(rawObject, "compare")
      val created = json.decodeRequired<Boolean>(rawObject, "created")
      val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
      val forced = json.decodeRequired<Boolean>(rawObject, "forced")
      val pusher = json.decodeRequired<InlineWebhookPushPusherX2fa664db>(rawObject, "pusher")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repository = json.decodeRequired<InlineWebhookPushRepositoryXe37d7d2d>(rawObject, "repository")
      if (!rawObject.containsKey("base_ref")) {
        throw SerializationException("WebhookPush is missing required property 'base_ref'")
      }
      val baseRef = rawObject["base_ref"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_commit")) {
        throw SerializationException("WebhookPush is missing required property 'head_commit'")
      }
      val headCommit = rawObject["head_commit"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPushHeadCommitX7bf4b1dd?>(requireNotNull(element)) }
      return WebhookPush(
        after = after,
        baseRef = baseRef,
        before = before,
        commits = commits,
        compare = compare,
        created = created,
        deleted = deleted,
        forced = forced,
        headCommit = headCommit,
        pusher = pusher,
        ref = ref,
        repository = repository,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
        senderState = json.decodeOptional(rawObject, "sender", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPush) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPush")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after", value.after)
        put("base_ref", value.baseRef?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("before", value.before)
        put("commits", json.encodeToJsonElement(value.commits))
        put("compare", value.compare)
        put("created", json.encodeToJsonElement(value.created))
        put("deleted", json.encodeToJsonElement(value.deleted))
        put("forced", json.encodeToJsonElement(value.forced))
        put("head_commit", value.headCommit?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pusher", json.encodeToJsonElement(value.pusher))
        put("ref", value.ref)
        put("repository", json.encodeToJsonElement(value.repository))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
        putState("sender", value.senderState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPush(block: WebhookPush.Builder.() -> Unit): WebhookPush = WebhookPush.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPush is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("WebhookPush property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
