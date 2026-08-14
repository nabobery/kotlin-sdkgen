package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class TestHelpersTestClockView(
  public val created: Int,
  @SerialName("deletes_after")
  public val deletesAfter: Int,
  @SerialName("frozen_time")
  public val frozenTime: Int,
  public val id: String,
  public val livemode: Boolean,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineTestHelpersTestClockObjectValueXb2175ccc,
  public val status: InlineTestHelpersTestClockStatusX28751bac,
  @SerialName("status_details")
  public val statusDetails: BillingClocksResourceStatusDetailsStatusDetails,
)

/**
 * A test clock enables deterministic control over objects in testmode. With a test clock, you can create
 * objects at a frozen time in the past or future, and advance to a specific future time to observe webhooks and state
 * changes. After the clock advances,
 * you can either validate the current state of your scenario (and test your assumptions), change the current state of
 * your scenario (and test more complex scenarios), or keep advancing forward in time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/test_helpers.test_clock
 */
@Serializable(with = TestHelpersTestClock.Serializer::class)
public class TestHelpersTestClock(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Time at which this clock is scheduled to auto delete.
   */
  public val deletesAfter: Int,
  /**
   * Time at which all objects belonging to this clock are frozen.
   */
  public val frozenTime: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTestHelpersTestClockObjectValueXb2175ccc,
  /**
   * The status of the Test Clock.
   */
  public val status: InlineTestHelpersTestClockStatusX28751bac,
  public val statusDetails: BillingClocksResourceStatusDetailsStatusDetails,
  /**
   * The custom name supplied at creation.
   */
  public val name: String? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var deletesAfterValue: Int? = null

    public var deletesAfter: Int
      get() = requireNotNull(deletesAfterValue) { "deletesAfter is required" }
      set(`value`) {
        deletesAfterValue = value
      }

    private var frozenTimeValue: Int? = null

    public var frozenTime: Int
      get() = requireNotNull(frozenTimeValue) { "frozenTime is required" }
      set(`value`) {
        frozenTimeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTestHelpersTestClockObjectValueXb2175ccc? = null

    public var objectValue: InlineTestHelpersTestClockObjectValueXb2175ccc
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTestHelpersTestClockStatusX28751bac? = null

    public var status: InlineTestHelpersTestClockStatusX28751bac
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusDetailsValue: BillingClocksResourceStatusDetailsStatusDetails? = null

    public var statusDetails: BillingClocksResourceStatusDetailsStatusDetails
      get() = requireNotNull(statusDetailsValue) { "statusDetails is required" }
      set(`value`) {
        statusDetailsValue = value
      }

    /**
     * The custom name supplied at creation.
     */
    public var name: String? = null

    public fun build(): TestHelpersTestClock {
      check(createdValue != null) { "created is required" }
      check(deletesAfterValue != null) { "deletesAfter is required" }
      check(frozenTimeValue != null) { "frozenTime is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      return TestHelpersTestClock(
        created = created,
        deletesAfter = deletesAfter,
        frozenTime = frozenTime,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TestHelpersTestClock = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TestHelpersTestClock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TestHelpersTestClock {
      val jsonDecoder = decoder.requireJsonDecoder("TestHelpersTestClock")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TestHelpersTestClock must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val deletesAfter = json.decodeRequired<Int>(rawObject, "deletes_after")
      val frozenTime = json.decodeRequired<Int>(rawObject, "frozen_time")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTestHelpersTestClockObjectValueXb2175ccc>(rawObject, "object")
      val status = json.decodeRequired<InlineTestHelpersTestClockStatusX28751bac>(rawObject, "status")
      val statusDetails = json.decodeRequired<BillingClocksResourceStatusDetailsStatusDetails>(rawObject, "status_details")
      return TestHelpersTestClock(
        created = created,
        deletesAfter = deletesAfter,
        frozenTime = frozenTime,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TestHelpersTestClock) {
      val jsonEncoder = encoder.requireJsonEncoder("TestHelpersTestClock")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("deletes_after", json.encodeToJsonElement(value.deletesAfter))
        put("frozen_time", json.encodeToJsonElement(value.frozenTime))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("status_details", json.encodeToJsonElement(value.statusDetails))
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun testHelpersTestClock(block: TestHelpersTestClock.Builder.() -> Unit): TestHelpersTestClock = TestHelpersTestClock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TestHelpersTestClock is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
