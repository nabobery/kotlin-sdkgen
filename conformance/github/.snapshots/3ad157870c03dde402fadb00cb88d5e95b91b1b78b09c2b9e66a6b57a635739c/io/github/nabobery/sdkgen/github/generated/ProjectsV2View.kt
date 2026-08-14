package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A view inside a projects v2 project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-view
 */
@Serializable(with = ProjectsV2View.Serializer::class)
public class ProjectsV2View(
  /**
   * The time when the view was created.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val creator: SimpleUser,
  groupBy: List<Int>,
  /**
   * The web URL of the view.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The unique identifier of the view.
   */
  public val id: Int,
  /**
   * The layout of the view.
   */
  public val layout: InlineProjectsV2ViewLayoutX9f93480f,
  /**
   * The name of the view.
   */
  public val name: String,
  /**
   * The node ID of the view.
   */
  public val nodeId: String,
  /**
   * The number of the view within the project.
   */
  public val number: Int,
  /**
   * The API URL of the project that contains the view.
   */
  public val projectUrl: String,
  sortBy: List<List<InlineProjectsV2ViewSortByItemItemX6dfa511b>>,
  /**
   * The time when the view was last updated.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  verticalGroupBy: List<Int>,
  visibleFields: List<Int>,
  /**
   * The filter query for the view.
   */
  public val filter: String? = null,
) {
  /**
   * The list of field IDs used for horizontal grouping.
   */
  public val groupBy: List<Int> = groupBy.toList()

  /**
   * The sorting configuration for the view. Each element is a tuple of [field_id, direction] where direction is "asc"
   * or "desc".
   */
  public val sortBy: List<List<InlineProjectsV2ViewSortByItemItemX6dfa511b>> =
      sortBy.map { element0 -> element0.toList() }

  /**
   * The list of field IDs used for vertical grouping (board layout).
   */
  public val verticalGroupBy: List<Int> = verticalGroupBy.toList()

  /**
   * The list of field IDs that are visible in the view.
   */
  public val visibleFields: List<Int> = visibleFields.toList()

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var creatorValue: SimpleUser? = null

    public var creator: SimpleUser
      get() = requireNotNull(creatorValue) { "creator is required" }
      set(`value`) {
        creatorValue = value
      }

    private var groupByValue: List<Int>? = null

    public var groupBy: List<Int>
      get() = requireNotNull(groupByValue) { "groupBy is required" }.toList()
      set(`value`) {
        groupByValue = value.toList()
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var layoutValue: InlineProjectsV2ViewLayoutX9f93480f? = null

    public var layout: InlineProjectsV2ViewLayoutX9f93480f
      get() = requireNotNull(layoutValue) { "layout is required" }
      set(`value`) {
        layoutValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var projectUrlValue: String? = null

    public var projectUrl: String
      get() = requireNotNull(projectUrlValue) { "projectUrl is required" }
      set(`value`) {
        projectUrlValue = value
      }

    private var sortByValue: List<List<InlineProjectsV2ViewSortByItemItemX6dfa511b>>? = null

    public var sortBy: List<List<InlineProjectsV2ViewSortByItemItemX6dfa511b>>
      get() = requireNotNull(sortByValue) { "sortBy is required" }.map { element0 -> element0.toList() }
      set(`value`) {
        sortByValue = value.map { element0 -> element0.toList() }
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var verticalGroupByValue: List<Int>? = null

    public var verticalGroupBy: List<Int>
      get() = requireNotNull(verticalGroupByValue) { "verticalGroupBy is required" }.toList()
      set(`value`) {
        verticalGroupByValue = value.toList()
      }

    private var visibleFieldsValue: List<Int>? = null

    public var visibleFields: List<Int>
      get() = requireNotNull(visibleFieldsValue) { "visibleFields is required" }.toList()
      set(`value`) {
        visibleFieldsValue = value.toList()
      }

    /**
     * The filter query for the view.
     */
    public var filter: String? = null

    public fun build(): ProjectsV2View {
      check(createdAtValue != null) { "createdAt is required" }
      check(creatorValue != null) { "creator is required" }
      check(groupByValue != null) { "groupBy is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(layoutValue != null) { "layout is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(sortByValue != null) { "sortBy is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(verticalGroupByValue != null) { "verticalGroupBy is required" }
      check(visibleFieldsValue != null) { "visibleFields is required" }
      return ProjectsV2View(
        createdAt = createdAt,
        creator = creator,
        groupBy = groupBy,
        htmlUrl = htmlUrl,
        id = id,
        layout = layout,
        name = name,
        nodeId = nodeId,
        number = number,
        projectUrl = projectUrl,
        sortBy = sortBy,
        updatedAt = updatedAt,
        verticalGroupBy = verticalGroupBy,
        visibleFields = visibleFields,
        filter = filter,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2View = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProjectsV2View> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2View {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2View")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2View must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val creator = json.decodeRequired<SimpleUser>(rawObject, "creator")
      val groupBy = json.decodeRequired<List<Int>>(rawObject, "group_by")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val layout = json.decodeRequired<InlineProjectsV2ViewLayoutX9f93480f>(rawObject, "layout")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val sortBy = json.decodeRequired<List<List<InlineProjectsV2ViewSortByItemItemX6dfa511b>>>(rawObject, "sort_by")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val verticalGroupBy = json.decodeRequired<List<Int>>(rawObject, "vertical_group_by")
      val visibleFields = json.decodeRequired<List<Int>>(rawObject, "visible_fields")
      return ProjectsV2View(
        createdAt = createdAt,
        creator = creator,
        groupBy = groupBy,
        htmlUrl = htmlUrl,
        id = id,
        layout = layout,
        name = name,
        nodeId = nodeId,
        number = number,
        projectUrl = projectUrl,
        sortBy = sortBy,
        updatedAt = updatedAt,
        verticalGroupBy = verticalGroupBy,
        visibleFields = visibleFields,
        filter = rawObject["filter"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2View) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2View")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("creator", json.encodeToJsonElement(value.creator))
        put("group_by", json.encodeToJsonElement(value.groupBy))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("layout", json.encodeToJsonElement(value.layout))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("project_url", value.projectUrl)
        put("sort_by", json.encodeToJsonElement(value.sortBy))
        put("updated_at", value.updatedAt)
        put("vertical_group_by", json.encodeToJsonElement(value.verticalGroupBy))
        put("visible_fields", json.encodeToJsonElement(value.visibleFields))
        value.filter?.let { put("filter", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2View(block: ProjectsV2View.Builder.() -> Unit): ProjectsV2View = ProjectsV2View.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2View is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
