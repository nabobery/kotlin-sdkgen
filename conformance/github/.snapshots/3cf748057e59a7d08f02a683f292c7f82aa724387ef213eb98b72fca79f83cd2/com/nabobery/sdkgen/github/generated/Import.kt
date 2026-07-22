package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * A repository import from an external source.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/import
 */
@Serializable(with = Import.Serializer::class)
public class Import internal constructor(
  public val authorsUrl: String,
  public val htmlUrl: String,
  public val repositoryUrl: String,
  public val status: InlineImportStatusXf4532cb3,
  public val url: String,
  public val vcs: String?,
  /**
   * The URL of the originating repository.
   */
  public val vcsUrl: String,
  private val authorsCountState: FieldState<Int?>,
  private val commitCountState: FieldState<Int?>,
  private val errorMessageState: FieldState<String?>,
  private val failedStepState: FieldState<String?>,
  private val hasLargeFilesState: FieldState<Boolean>,
  private val importPercentState: FieldState<Int?>,
  private val largeFilesCountState: FieldState<Int>,
  private val largeFilesSizeState: FieldState<Int>,
  private val messageState: FieldState<String>,
  private val projectChoicesState: FieldState<List<InlineImportProjectChoicesItemX77a49ad4>>,
  private val pushPercentState: FieldState<Int?>,
  private val statusTextState: FieldState<String?>,
  private val svcRootState: FieldState<String>,
  private val svnRootState: FieldState<String>,
  private val tfvcProjectState: FieldState<String>,
  private val useLfsState: FieldState<Boolean>,
) {
  public val authorsCount: Int?
    get() = authorsCountState.valueOrNull()

  public val commitCount: Int?
    get() = commitCountState.valueOrNull()

  public val errorMessage: String?
    get() = errorMessageState.valueOrNull()

  public val failedStep: String?
    get() = failedStepState.valueOrNull()

  public val hasLargeFiles: Boolean?
    get() = hasLargeFilesState.valueOrNull()

  public val importPercent: Int?
    get() = importPercentState.valueOrNull()

  public val largeFilesCount: Int?
    get() = largeFilesCountState.valueOrNull()

  public val largeFilesSize: Int?
    get() = largeFilesSizeState.valueOrNull()

  public val message: String?
    get() = messageState.valueOrNull()

  public val projectChoices: List<InlineImportProjectChoicesItemX77a49ad4>?
    get() = projectChoicesState.valueOrNull()

  public val pushPercent: Int?
    get() = pushPercentState.valueOrNull()

  public val statusText: String?
    get() = statusTextState.valueOrNull()

  public val svcRoot: String?
    get() = svcRootState.valueOrNull()

  public val svnRoot: String?
    get() = svnRootState.valueOrNull()

  public val tfvcProject: String?
    get() = tfvcProjectState.valueOrNull()

  public val useLfs: Boolean?
    get() = useLfsState.valueOrNull()

  public constructor(
    authorsUrl: String,
    htmlUrl: String,
    repositoryUrl: String,
    status: InlineImportStatusXf4532cb3,
    url: String,
    vcs: String?,
    vcsUrl: String,
  ) : this(authorsUrl = authorsUrl,
  htmlUrl = htmlUrl,
  repositoryUrl = repositoryUrl,
  status = status,
  url = url,
  vcs = vcs,
  vcsUrl = vcsUrl,
  authorsCountState = FieldState.Absent,
  commitCountState = FieldState.Absent,
  errorMessageState = FieldState.Absent,
  failedStepState = FieldState.Absent,
  hasLargeFilesState = FieldState.Absent,
  importPercentState = FieldState.Absent,
  largeFilesCountState = FieldState.Absent,
  largeFilesSizeState = FieldState.Absent,
  messageState = FieldState.Absent,
  projectChoicesState = FieldState.Absent,
  pushPercentState = FieldState.Absent,
  statusTextState = FieldState.Absent,
  svcRootState = FieldState.Absent,
  svnRootState = FieldState.Absent,
  tfvcProjectState = FieldState.Absent,
  useLfsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `authors_count`.
   */
  public fun authorsCountPresence(): FieldPresence = authorsCountState.presence

  /**
   * Returns the wire presence of `commit_count`.
   */
  public fun commitCountPresence(): FieldPresence = commitCountState.presence

  /**
   * Returns the wire presence of `error_message`.
   */
  public fun errorMessagePresence(): FieldPresence = errorMessageState.presence

  /**
   * Returns the wire presence of `failed_step`.
   */
  public fun failedStepPresence(): FieldPresence = failedStepState.presence

  /**
   * Returns the wire presence of `has_large_files`.
   */
  public fun hasLargeFilesPresence(): FieldPresence = hasLargeFilesState.presence

  /**
   * Returns the wire presence of `import_percent`.
   */
  public fun importPercentPresence(): FieldPresence = importPercentState.presence

  /**
   * Returns the wire presence of `large_files_count`.
   */
  public fun largeFilesCountPresence(): FieldPresence = largeFilesCountState.presence

  /**
   * Returns the wire presence of `large_files_size`.
   */
  public fun largeFilesSizePresence(): FieldPresence = largeFilesSizeState.presence

  /**
   * Returns the wire presence of `message`.
   */
  public fun messagePresence(): FieldPresence = messageState.presence

  /**
   * Returns the wire presence of `project_choices`.
   */
  public fun projectChoicesPresence(): FieldPresence = projectChoicesState.presence

  /**
   * Returns the wire presence of `push_percent`.
   */
  public fun pushPercentPresence(): FieldPresence = pushPercentState.presence

  /**
   * Returns the wire presence of `status_text`.
   */
  public fun statusTextPresence(): FieldPresence = statusTextState.presence

  /**
   * Returns the wire presence of `svc_root`.
   */
  public fun svcRootPresence(): FieldPresence = svcRootState.presence

  /**
   * Returns the wire presence of `svn_root`.
   */
  public fun svnRootPresence(): FieldPresence = svnRootState.presence

  /**
   * Returns the wire presence of `tfvc_project`.
   */
  public fun tfvcProjectPresence(): FieldPresence = tfvcProjectState.presence

  /**
   * Returns the wire presence of `use_lfs`.
   */
  public fun useLfsPresence(): FieldPresence = useLfsState.presence

  public class Builder {
    private var authorsUrlValue: String? = null

    public var authorsUrl: String
      get() = requireNotNull(authorsUrlValue) { "authorsUrl is required" }
      set(`value`) {
        authorsUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var statusValue: InlineImportStatusXf4532cb3? = null

    public var status: InlineImportStatusXf4532cb3
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var vcsUrlValue: String? = null

    public var vcsUrl: String
      get() = requireNotNull(vcsUrlValue) { "vcsUrl is required" }
      set(`value`) {
        vcsUrlValue = value
      }

    private var vcsState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var vcs: String?
      get() = vcsState.valueOrNull()
      set(`value`) {
        vcsState = value.toNullableFieldState()
      }

    private var authorsCountState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var authorsCount: Int?
      get() = authorsCountState.valueOrNull()
      set(`value`) {
        authorsCountState = value.toNullableFieldState()
      }

    private var commitCountState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var commitCount: Int?
      get() = commitCountState.valueOrNull()
      set(`value`) {
        commitCountState = value.toNullableFieldState()
      }

    private var errorMessageState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var errorMessage: String?
      get() = errorMessageState.valueOrNull()
      set(`value`) {
        errorMessageState = value.toNullableFieldState()
      }

    private var failedStepState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var failedStep: String?
      get() = failedStepState.valueOrNull()
      set(`value`) {
        failedStepState = value.toNullableFieldState()
      }

    private var hasLargeFilesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasLargeFiles: Boolean?
      get() = hasLargeFilesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasLargeFiles is not nullable; call unsetHasLargeFiles() to omit it" }
        hasLargeFilesState = FieldState.Value(present)
      }

    private var importPercentState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var importPercent: Int?
      get() = importPercentState.valueOrNull()
      set(`value`) {
        importPercentState = value.toNullableFieldState()
      }

    private var largeFilesCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var largeFilesCount: Int?
      get() = largeFilesCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "largeFilesCount is not nullable; call unsetLargeFilesCount() to omit it" }
        largeFilesCountState = FieldState.Value(present)
      }

    private var largeFilesSizeState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var largeFilesSize: Int?
      get() = largeFilesSizeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "largeFilesSize is not nullable; call unsetLargeFilesSize() to omit it" }
        largeFilesSizeState = FieldState.Value(present)
      }

    private var messageState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var message: String?
      get() = messageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "message is not nullable; call unsetMessage() to omit it" }
        messageState = FieldState.Value(present)
      }

    private var projectChoicesState: FieldState<List<InlineImportProjectChoicesItemX77a49ad4>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var projectChoices: List<InlineImportProjectChoicesItemX77a49ad4>?
      get() = projectChoicesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "projectChoices is not nullable; call unsetProjectChoices() to omit it" }
        projectChoicesState = FieldState.Value(present)
      }

    private var pushPercentState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pushPercent: Int?
      get() = pushPercentState.valueOrNull()
      set(`value`) {
        pushPercentState = value.toNullableFieldState()
      }

    private var statusTextState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var statusText: String?
      get() = statusTextState.valueOrNull()
      set(`value`) {
        statusTextState = value.toNullableFieldState()
      }

    private var svcRootState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var svcRoot: String?
      get() = svcRootState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "svcRoot is not nullable; call unsetSvcRoot() to omit it" }
        svcRootState = FieldState.Value(present)
      }

    private var svnRootState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var svnRoot: String?
      get() = svnRootState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "svnRoot is not nullable; call unsetSvnRoot() to omit it" }
        svnRootState = FieldState.Value(present)
      }

    private var tfvcProjectState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tfvcProject: String?
      get() = tfvcProjectState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tfvcProject is not nullable; call unsetTfvcProject() to omit it" }
        tfvcProjectState = FieldState.Value(present)
      }

    private var useLfsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var useLfs: Boolean?
      get() = useLfsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "useLfs is not nullable; call unsetUseLfs() to omit it" }
        useLfsState = FieldState.Value(present)
      }

    /**
     * Omits `authors_count` from serialized output.
     */
    public fun unsetAuthorsCount() {
      authorsCountState = FieldState.Absent
    }

    /**
     * Omits `commit_count` from serialized output.
     */
    public fun unsetCommitCount() {
      commitCountState = FieldState.Absent
    }

    /**
     * Omits `error_message` from serialized output.
     */
    public fun unsetErrorMessage() {
      errorMessageState = FieldState.Absent
    }

    /**
     * Omits `failed_step` from serialized output.
     */
    public fun unsetFailedStep() {
      failedStepState = FieldState.Absent
    }

    /**
     * Omits `has_large_files` from serialized output.
     */
    public fun unsetHasLargeFiles() {
      hasLargeFilesState = FieldState.Absent
    }

    /**
     * Omits `import_percent` from serialized output.
     */
    public fun unsetImportPercent() {
      importPercentState = FieldState.Absent
    }

    /**
     * Omits `large_files_count` from serialized output.
     */
    public fun unsetLargeFilesCount() {
      largeFilesCountState = FieldState.Absent
    }

    /**
     * Omits `large_files_size` from serialized output.
     */
    public fun unsetLargeFilesSize() {
      largeFilesSizeState = FieldState.Absent
    }

    /**
     * Omits `message` from serialized output.
     */
    public fun unsetMessage() {
      messageState = FieldState.Absent
    }

    /**
     * Omits `project_choices` from serialized output.
     */
    public fun unsetProjectChoices() {
      projectChoicesState = FieldState.Absent
    }

    /**
     * Omits `push_percent` from serialized output.
     */
    public fun unsetPushPercent() {
      pushPercentState = FieldState.Absent
    }

    /**
     * Omits `status_text` from serialized output.
     */
    public fun unsetStatusText() {
      statusTextState = FieldState.Absent
    }

    /**
     * Omits `svc_root` from serialized output.
     */
    public fun unsetSvcRoot() {
      svcRootState = FieldState.Absent
    }

    /**
     * Omits `svn_root` from serialized output.
     */
    public fun unsetSvnRoot() {
      svnRootState = FieldState.Absent
    }

    /**
     * Omits `tfvc_project` from serialized output.
     */
    public fun unsetTfvcProject() {
      tfvcProjectState = FieldState.Absent
    }

    /**
     * Omits `use_lfs` from serialized output.
     */
    public fun unsetUseLfs() {
      useLfsState = FieldState.Absent
    }

    public fun build(): Import {
      check(authorsUrlValue != null) { "authorsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      check(vcsUrlValue != null) { "vcsUrl is required" }
      check(vcsState !== FieldState.Absent) { "vcs is required, even when null" }
      return Import(
        authorsUrl = authorsUrl,
        htmlUrl = htmlUrl,
        repositoryUrl = repositoryUrl,
        status = status,
        url = url,
        vcs = vcsState.valueOrNull(),
        vcsUrl = vcsUrl,
        authorsCountState = authorsCountState,
        commitCountState = commitCountState,
        errorMessageState = errorMessageState,
        failedStepState = failedStepState,
        hasLargeFilesState = hasLargeFilesState,
        importPercentState = importPercentState,
        largeFilesCountState = largeFilesCountState,
        largeFilesSizeState = largeFilesSizeState,
        messageState = messageState,
        projectChoicesState = projectChoicesState,
        pushPercentState = pushPercentState,
        statusTextState = statusTextState,
        svcRootState = svcRootState,
        svnRootState = svnRootState,
        tfvcProjectState = tfvcProjectState,
        useLfsState = useLfsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Import = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Import> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Import {
      val jsonDecoder = decoder.requireJsonDecoder("Import")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Import must be a JSON object")
      val authorsUrl = json.decodeRequired<String>(rawObject, "authors_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val status = json.decodeRequired<InlineImportStatusXf4532cb3>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      val vcsUrl = json.decodeRequired<String>(rawObject, "vcs_url")
      if (!rawObject.containsKey("vcs")) {
        throw SerializationException("Import is missing required property 'vcs'")
      }
      val vcs = rawObject["vcs"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Import(
        authorsUrl = authorsUrl,
        htmlUrl = htmlUrl,
        repositoryUrl = repositoryUrl,
        status = status,
        url = url,
        vcs = vcs,
        vcsUrl = vcsUrl,
        authorsCountState = json.decodeOptional(rawObject, "authors_count", nullable = true),
        commitCountState = json.decodeOptional(rawObject, "commit_count", nullable = true),
        errorMessageState = json.decodeOptional(rawObject, "error_message", nullable = true),
        failedStepState = json.decodeOptional(rawObject, "failed_step", nullable = true),
        hasLargeFilesState = json.decodeOptional(rawObject, "has_large_files", nullable = false),
        importPercentState = json.decodeOptional(rawObject, "import_percent", nullable = true),
        largeFilesCountState = json.decodeOptional(rawObject, "large_files_count", nullable = false),
        largeFilesSizeState = json.decodeOptional(rawObject, "large_files_size", nullable = false),
        messageState = json.decodeOptional(rawObject, "message", nullable = false),
        projectChoicesState = json.decodeOptional(rawObject, "project_choices", nullable = false),
        pushPercentState = json.decodeOptional(rawObject, "push_percent", nullable = true),
        statusTextState = json.decodeOptional(rawObject, "status_text", nullable = true),
        svcRootState = json.decodeOptional(rawObject, "svc_root", nullable = false),
        svnRootState = json.decodeOptional(rawObject, "svn_root", nullable = false),
        tfvcProjectState = json.decodeOptional(rawObject, "tfvc_project", nullable = false),
        useLfsState = json.decodeOptional(rawObject, "use_lfs", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Import) {
      val jsonEncoder = encoder.requireJsonEncoder("Import")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("authors_url", value.authorsUrl)
        put("html_url", value.htmlUrl)
        put("repository_url", value.repositoryUrl)
        put("status", json.encodeToJsonElement(value.status))
        put("url", value.url)
        put("vcs", value.vcs?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("vcs_url", value.vcsUrl)
        putState("authors_count", value.authorsCountState, json::encodeToJsonElement)
        putState("commit_count", value.commitCountState, json::encodeToJsonElement)
        putState("error_message", value.errorMessageState, json::encodeToJsonElement)
        putState("failed_step", value.failedStepState, json::encodeToJsonElement)
        putState("has_large_files", value.hasLargeFilesState, json::encodeToJsonElement)
        putState("import_percent", value.importPercentState, json::encodeToJsonElement)
        putState("large_files_count", value.largeFilesCountState, json::encodeToJsonElement)
        putState("large_files_size", value.largeFilesSizeState, json::encodeToJsonElement)
        putState("message", value.messageState, json::encodeToJsonElement)
        putState("project_choices", value.projectChoicesState, json::encodeToJsonElement)
        putState("push_percent", value.pushPercentState, json::encodeToJsonElement)
        putState("status_text", value.statusTextState, json::encodeToJsonElement)
        putState("svc_root", value.svcRootState, json::encodeToJsonElement)
        putState("svn_root", value.svnRootState, json::encodeToJsonElement)
        putState("tfvc_project", value.tfvcProjectState, json::encodeToJsonElement)
        putState("use_lfs", value.useLfsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun `import`(block: Import.Builder.() -> Unit): Import = Import.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Import is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Import property '" + name + "' is not nullable")
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
